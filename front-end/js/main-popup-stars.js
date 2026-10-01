import { createStar } from "./stars-handling.js";
import { seeStar } from "./stars-handling.js";

export function startPopUp(popup, popupContent)
{
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

    const addStarButton = document.querySelector("#create-star");
    const seeStarButton = document.querySelector("#see-star");
    const updateStarButton = document.querySelector("#update-star");
    const deleteStarButton = document.querySelector("#delete-star");

    addStarButton.addEventListener("click", () => {
        createStar(popup, popupContent);
    })

    seeStarButton.addEventListener("click", () => {
        seeStar(popup, popupContent);
    })

    updateStarButton.addEventListener("click", () => {
        createStar(popup, popupContent);
    })

    deleteStarButton.addEventListener("click", () => {
        createStar(popup, popupContent);
    })
}