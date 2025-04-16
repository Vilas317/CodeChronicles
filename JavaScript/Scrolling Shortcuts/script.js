const s1 = document.querySelector('#s1');
const s2 = document.querySelector('#s2');
const s3 = document.querySelector('#s3');

window.addEventListener('keydown', function(e){
    if(e.key == 1){
        s1.scrollIntoView();
    } else if(e.key == 2){
        s2.scrollIntoView();
    } else if(e.key == 3){
        s3.scrollIntoView();
    } else if(e.key == 't'){
        this.window.scrollTo(0, 0);
    } else if(e.key == 'b'){
        this.window.scrollTo(0, document.body.scrollHeight);
    }
})