function cambioBG(bg, titolo) {
    let banner = document.querySelector('.banner');
    let contenuti = document.querySelectorAll('.content');
    banner.style.backgroundSize = 'cover';
    banner.style.backgroundPosition = 'center';

    contenuti.forEach(contenuti =>{
        contenuti.classList.remove('active');
        if (contenuti.classList.contains(title)) {
            contenuti.classList.add('active')
        }
    })
}