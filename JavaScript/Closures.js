function grandMa() {
    const secret = `Maggie Masala`;

    function bitti() {
        console.log("I know the secret:", secret);
    }

    return bitti;
}

let bittiFunc = grandMa();
bittiFunc();