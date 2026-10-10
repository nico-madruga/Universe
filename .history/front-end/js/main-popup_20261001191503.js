import { createStar } from "./stars-handling";

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

    const addStar = document.querySelector("#create-star");
    const seeStar = document.querySelector("#see-star");
    const updateStar = document.querySelector("#update-star");
    const deleteStar = document.querySelector("#delete-star");

    addStar.addEventListener("click", )
}