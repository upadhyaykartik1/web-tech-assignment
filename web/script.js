const form = document.getElementById("contactForm");
const message = document.getElementById("message");

form.addEventListener("submit", function(event) {
    event.preventDefault(); // prevent page reload

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();

    if (name === "" || email === "") {
        message.style.color = "red";
        message.textContent = "All fields are required!";
    } else if (!email.includes("@")) {
        message.style.color = "red";
        message.textContent = "Enter a valid email!";
    } else {
        message.style.color = "green";
        message.textContent = "Form submitted successfully!";
        form.reset();
    }
});