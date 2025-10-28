document.getElementById("adminBtn").addEventListener("click", function() {
    console.log("Admin klickad");
});

document.getElementById("membersBtn").addEventListener("click", function() {
    console.log("Medlemmar klickad");
});
document.getElementById("addMemberForm").addEventListener("submit", function(e){
    e.preventDefault();

    const fname = document.getElementById("fname").value;
    const lname = document.getElementById("lname").value;
    const bday = document.getElementById("bday").value;
    const email = document.getElementById("email").value;

    console.log("Ny medlem:", fname, lname, bday, email);
    alert("Medlem sparad!");

    this.reset();
});
const list = document.getElementById("membersList");
const members = JSON.parse(localStorage.getItem("members")) || [];

if (members.length > 0) {
    list.innerHTML = "";
    members.forEach(m => {
        const item = document.createElement("li");
        item.textContent = `${m.fname} ${m.lname} • ${m.email}`;
        list.appendChild(item);
    });
}