const popup = document.querySelector("#pop-up");
const popupContent = document.querySelector("#pop-up #pop-up-content");
const starButton = document.querySelector("#stars-button");

starButton.addEventListener("click", () => {
    popup.classList.add("open");

    popupContent.textContent = "Hello nigga!";
})