const arrayContainer = document.getElementById("array-container");
const statusText = document.getElementById("status");
const speedInput = document.getElementById("speed");
const sizeInput = document.getElementById("size");
const stepsText = document.getElementById("steps");

let array = [];
let delay = 200;
let isPaused = false;
let steps = 0;

speedInput.addEventListener("input", () => {
    delay = speedInput.value;
});

sizeInput.addEventListener("input", () => {
    generateArray();
});

function generateArray() {
    steps = 0;
    stepsText.textContent = `Steps: ${steps}`;
    array = [];
    arrayContainer.innerHTML = "";
    const size = sizeInput.value;

    for (let i = 0; i < size; i++) {
        const value = Math.floor(Math.random() * 100) + 1;
        array.push(value);

        const bar = document.createElement("div");
        bar.classList.add("bar");
        bar.style.height = `${value * 3}px`;
        bar.style.width = `${(90 / size)}%`;
        arrayContainer.appendChild(bar);
    }
}

function pauseSorting() {
    isPaused = true;
}

function resumeSorting() {
    isPaused = false;
}

async function wait() {
    while (isPaused) {
        await new Promise(resolve => setTimeout(resolve, 100));
    }
}

async function startSorting() {
    const algorithm = document.getElementById("algorithm").value;
    statusText.textContent = `Current Algorithm: ${algorithm.toUpperCase()}`;

    switch (algorithm) {
        case "bubble":
            await bubbleSort();
            break;
        case "selection":
            await selectionSort();
            break;
        case "merge":
            await mergeSort(0, array.length - 1);
            break;
        case "quick":
            await quickSort(0, array.length - 1);
            break;
    }

    statusText.textContent = `✅ Sorting Completed`;
}

async function swap(i, j) {
    const bars = document.getElementsByClassName("bar");
    bars[i].classList.add("swapping");
    bars[j].classList.add("swapping");
    await wait();
    await new Promise(resolve => setTimeout(resolve, delay));

    [array[i], array[j]] = [array[j], array[i]];
    bars[i].style.height = `${array[i] * 3}px`;
    bars[j].style.height = `${array[j] * 3}px`;

    bars[i].classList.remove("swapping");
    bars[j].classList.remove("swapping");
    steps++;
    stepsText.textContent = `Steps: ${steps}`;
}

// Bubble Sort
async function bubbleSort() {
    const bars = document.getElementsByClassName("bar");
    for (let i = 0; i < array.length - 1; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            bars[j].classList.add("comparing");
            bars[j + 1].classList.add("comparing");
            await wait();
            await new Promise(resolve => setTimeout(resolve, delay));

            if (array[j] > array[j + 1]) {
                await swap(j, j + 1);
            }

            bars[j].classList.remove("comparing");
            bars[j + 1].classList.remove("comparing");
        }
    }
}

// Selection Sort
async function selectionSort() {
    const bars = document.getElementsByClassName("bar");
    for (let i = 0; i < array.length - 1; i++) {
        let minIndex = i;

        for (let j = i + 1; j < array.length; j++) {
            bars[j].classList.add("comparing");
            await wait();
            await new Promise(resolve => setTimeout(resolve, delay));

            if (array[j] < array[minIndex]) {
                minIndex = j;
            }

            bars[j].classList.remove("comparing");
        }
        await swap(i, minIndex);
    }
}

// Merge Sort
async function mergeSort(start, end) {
    if (start >= end) return;

    let mid = Math.floor((start + end) / 2);
    await mergeSort(start, mid);
    await mergeSort(mid + 1, end);
    await merge(start, mid, end);
}

// Quick Sort
async function quickSort(start, end) {
    if (start >= end) return;

    let pivotIndex = await partition(start, end);
    await quickSort(start, pivotIndex - 1);
    await quickSort(pivotIndex + 1, end);
}

async function partition(start, end) {
    let pivot = array[end];
    let i = start - 1;

    for (let j = start; j < end; j++) {
        if (array[j] < pivot) {
            i++;
            await swap(i, j);
        }
    }
    await swap(i + 1, end);
    return i + 1;
}

// Generate initial array
generateArray();
