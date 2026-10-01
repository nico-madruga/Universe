const popup = document.querySelector("#pop-up");
const popupContent = document.querySelector("#pop-up-content");
const standardButtons = document.querySelectorAll(".standard_button");
const starsButton = document.querySelector("#stars-button");
const planetsButton = document.querySelector("#planets-button");
const systemsButton = document.querySelector("#systems-button");
const galaxiesButton = document.querySelector("#galaxies-button");

standardButtons.forEach((event) => {
    console.log(event.getAttribute('id'));
})


/*
starsButton.addEventListener("click", () => {
    popup.classList.add("open");
    popupContent.textContent = "Hello Stars!";
})

planetsButton.addEventListener("click", () => {
    popup.classList.add("open");

    popupContent.textContent = "Hello Planets!";
})

systemsButton.addEventListener("click", () => {
    popup.classList.add("open");

    popupContent.textContent = "Hello Systems!";
})

galaxiesButton.addEventListener("click", () => {
    popup.classList.add("open");

    popupContent.textContent = "Hello Galaxies!";
})
*/

document.addEventListener("click", (event) => {
    if(event.target === popup)
    {
        popup.classList.remove("open");
    }
})