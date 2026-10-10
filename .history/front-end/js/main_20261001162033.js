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
    <h2 id="pop-up-title">STARS</h2>
    </header>

    <nav>
    <button class="standard_button">Create Star</button>
    <button class="standard_button">See Stars</button>
    <button class="standard_button">Update Star</button>
    <button class="standard_button">Delete Star</button>
    </nav>
    `;

    standardButtons .addEventListener("click", () => {
        popupContent.innerHTML = `
        <h1>evite</h1>
        `
    })
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