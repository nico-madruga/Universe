const popup = document.querySelector("#pop-up");
const popupContent = document.querySelector("#pop-up-content");
const standardButtons = document.querySelectorAll(".standard_button");
const starsButton = document.querySelector("#stars-button");
const planetsButton = document.querySelector("#planets-button");
const systemsButton = document.querySelector("#systems-button");
const galaxiesButton = document.querySelector("#galaxies-button");


starsButton.addEventListener("click", () => {
    popup.classList.add("open");
    popupContent.innerHTML = `
    <header>
    <h2>STARS</h2>
    </header>

    <nav>
    <button class="standard-button">Create Star</button>
    <button class="standard-button">See Stars</button>
    <button class="standard-button">Update Star</button>
    <button class="standard-button">Delete Star</button>
    </nav>
    `;
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


document.addEventListener("click", (event) => {
    if(event.target === popup)
    {
        popup.classList.remove("open");
    }
})