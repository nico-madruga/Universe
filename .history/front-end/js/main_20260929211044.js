const popup = document.querySelector("#pop-up")
const starButton = document.querySelector("#stars-button");

starButton.addEventListener("click", () => {
    popup.classList.add("open")
})