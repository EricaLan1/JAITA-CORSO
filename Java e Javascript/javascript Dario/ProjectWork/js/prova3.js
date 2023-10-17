    function cambioBg(bg, titolo) {
        let banner = document.querySelector('.banner');
        let contenuti = document.querySelectorAll('.content');
        banner.style.background = `url("../img/${bg}")`;
        banner.style.backgroundSize = 'cover';
        banner.style.backgroundPosition = 'center';

        contenuti.forEach(content =>{
            content.classList.remove('active');
            if (content.classList.contains(titolo)) {
                content.classList.add('active')
            }
        });
    }