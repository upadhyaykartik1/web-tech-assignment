document.getElementById("myForm").addEventListener("submit", function(e) {
    e.preventDefault();

    let name = document.getElementById("name").value;

    if (name === "") {
        alert("Name cannot be empty");
    } else {
        document.getElementById("output").innerText = "Hello " + name;
    }
});
