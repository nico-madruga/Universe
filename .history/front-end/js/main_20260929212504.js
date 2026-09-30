const popup = document.querySelector("#pop-up");
const popupContent = document.querySelector("#pop-up #pop-up-content");
const starsButton = document.querySelector("#stars-button");
const planetsButton = document.querySelector("#stars-button");
const systemsButton = document.querySelector("#stars-button");
const galaxiesButton = document.querySelector("#stars-button");


starsButton.addEventListener("click", () => {
    popup.classList.add("open");

    popupContent.textContent = "Hello nigga!";
})