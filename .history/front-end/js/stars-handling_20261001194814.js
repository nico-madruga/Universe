export function createStar(popup, popupContent)
{

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

        createButton.addEventListener("click", () => {
            const starName = document.querySelector('#star-name').value;
            const starMass = Number(document.querySelector('#star-mass').value);
            const starTemp = Number(document.querySelector('#star-temp').value);

            const star = {
                name: starName,
                mass: starMass,
                temperature: starTemp 
            }

            console.log(JSON.stringify(star));

            fetch("http://localhost:8080/stars", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(star)
            });
        });
}

export function seeStar(popup, popupContent)
{
    popupContent.innerHTML = `
        <h2 id="pop-up-title">STARS</h2>
        <p>See Stars<p>
        <div id="search-stars-block">
            <input type="text" id="star-name" class="standard-input" placeholder="Name">

            <button id='see-stars-button' class="control-button">ENTER</button>
        </div>
    `
    const seeButton = document.querySelector("#see-stars-button");

    seeButton.addEventListener("click", () => {
        const nameSearcher = document.querySelector("#star-name").value;

        fetch(`http://localhost:8080/stars?name=${nameSearcher}`);
    })
}