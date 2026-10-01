const popup = document.querySelector("#pop-up");
const popupContent = document.querySelector("#pop-up-content");
const standardButtons = document.querySelectorAll(".standard-button");
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
    <button id="create-star" class="standard-button">Create Star</button>
    <button id="see-star" class="standard-button">See Stars</button>
    <button id="update-star" class="standard-button">Update Star</button>
    <button id="delete-star" class="standard-button">Delete Star</button>
    </nav>
    `;

    const addStar = document.querySelector("#create-star");
    const seeStar = document.querySelector("#see-star");
    const updateStar = document.querySelector("#update-star");
    const deleteStar = document.querySelector("#delete-star");

    addStar.addEventListener("click", () => {
        popupContent.innerHTML = `
        <h2 id="pop-up-title">STARS</h2>
        <p>Create Stars<p>
        <div id="create-star-block">
            <input type="text" id="star-name" class="standard-input" placeholder="Name">
            <input type="number" id="star-mass" class="standard-input" placeholder="Mass">
            <input type="number" id="star-temp" class="standard-input" placeholder="Temperature">

            <button id='create-star-button' class="control-button">ENTER</button>
        </div>
        `
        const createButton = document.querySelector("#create-star-button");

        createButton.addEventListener(() ={
            console.log("clicoceoaa");
        })
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