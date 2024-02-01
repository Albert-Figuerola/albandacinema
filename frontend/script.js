var modalWindow = document.getElementById('modalSignin');

var openModal = document.getElementById('openModal');
var closeModal = document.getElementById('closeModal');

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