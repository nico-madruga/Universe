const popup = document.querySelector("#pop-up");
const popupContent = document.querySelector("#pop-up-content");
const standardButtons = document.querySelectorAll(".standard_button");
const starsButton = document.querySelector("#stars_button");
const planetsButton = document.querySelector("#planets_button");
const systemsButton = document.querySelector("#systems_button");
const galaxiesButton = document.querySelector("#galaxies_button");


starsButton.addEventListener("click", () => {
    popup.classList.add("open");
    popupContent.innerHTML = `
    <header>
    <h2>STARS</h2>
    </header>

    <nav>
    _button class="standard_button">Create Star<_button>
    _button class="standard_button">See Stars<_button>
    _button class="standard_button">Update Star<_button>
    _button class="standard_button">Delete Star<_button>
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