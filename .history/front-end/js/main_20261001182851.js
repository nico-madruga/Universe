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
    <button id="create-star" class="standard_button">Create Star</button>
    <button id="see-star" class="standard_button">See Stars</button>
    <button id="update-star" class="standard_button">Update Star</button>
    <button id="delete-star" class="standard_button">Delete Star</button>
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
            <input type="text" id="star-name" class="standard_button" placeholder="Type the name of the star">
            <input type="text" id="star-name" class="standard_button">
            <input type="text" id="star-name" class="standard_button">

            <button class="control-buttons">
        </div>
        `
    
        const starInput = document.querySelector('star-name');
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