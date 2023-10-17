    function cambioBg(Bg, titolo) {
        let banner = document.querySelector('.banner');
        let contenuti = document.querySelectorAll('.content');
        banner.style.background = `url("../img/${Bg}")`;
        banner.style.backgroundSize = 'cover';
        banner.style.backgroundPosition = 'center';

        contenuti.forEach(content =>{
            content.classList.remove('active');
            if (content.classList.contains(titolo)) {
                content.classList.add('active')
            }
        });
    }