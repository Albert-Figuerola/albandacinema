let URL = 'http://localhost:8080/';
const MAX_STARS = 5
$(document).ready(function () {
    // Images in cards
    $albumRow = $('#albumRow');
    fetch(URL + 'api/filmSummary')
        .then(response => response.json())
        .then(data => {
            data.forEach(film => {
                let score = film.score
                let $newAlbum = $(`
                    <div class="col">
                        <div class="card shadow-sm">
                            <div class="card shadow-sm">
                                <img src="` + film.url + `" alt="Film image">
                            </div>
                            <div class="card-body">
                                <p class="card-text">` + film.name + `</p>
                                <div id="cardSummary" class="d-flex justify-content-between align-items-center">
                                <small class="text-body-secondary">` + film.duration + ` min.</small>
                                </div>
                                <div class="stars"></div>                                
                            </div>
                        </div>
                    </div>
                `)
                let starsHTML = ''
                for (let i = 0; i < score; i++) {
                    starsHTML += '<i class="fa-solid fa-star"></i>'
                }
                let moreStars = MAX_STARS - score
                if (score < MAX_STARS) {
                    for (let i = 0; i < moreStars; i++) {
                        starsHTML += '<i id="star" class="fa-regular fa-star"></i>'
                    }
                }
                $newAlbum.find('.stars').html(starsHTML)
                $albumRow.append($newAlbum)
            })
        })
        .catch(error => console.log('Error in fetch'));



    /*
    document.addEventListener("DOMContentLoaded", function () {
        // Hacer una solicitud AJAX para obtener datos del controlador
        fetch(URL + 'api/film')
            .then(response => response.json())
            .then(data => {
                console.log("Hola")
                cardImd.innerHTML = `
                <img src="${data.urlImagen}" alt="Imagen de la película">
                <p>${data.descripcion}</p>
            `;
            })
            .catch(error => console.error('Error al obtener datos:', error));
    });

    // Modal
    let modalWindow = document.getElementById('modalSignin');
    let openModal = document.getElementById('openModal');
    let closeModal = document.getElementById('closeModal');

    openModal.addEventListener('click', () => {
        modalWindow.style.display = 'block';
    });

    closeModal.addEventListener('click', () => {
        modalWindow.style.display = 'none';
    });

    window.addEventListener('click', (event) => {
        if (event.target == modalWindow) {
            modalWindow.style.display = 'none'
        }
    })
    */

});