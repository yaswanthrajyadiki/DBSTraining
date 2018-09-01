var cars = new Array();
cars[0] = "BMW";
cars[1] = "Benz";
cars[2] = "Volvo";
var allCars = "All cars are ";
for (var car in cars) {
	allCars += cars[car] + ", ";
}

var person = {
	firstname: "Yaswanth",
	lastname: "Raj Kumar",
};

function validate(firstname, lastname) {
	var flag = true;
	var form = document.getElementById("onSub");
	if(firstname.value != "Mickey") {
		person.firstname = firstname.value;
	} else {
		flag = false;
		document.getElementById("firstnameError").append(document.createElement("p").appendChild(
		document.createTextNode("Please enter firstname other than Mickey")));
	}
	if(lastname.value != "Mouse") {
		person.lastname = lastname.value;
	} else {
		flag = false;
		document.getElementById("lastnameError").innerHTML = "Please enter lastname other than Mouse";
	}
	if(flag) {
		document.getElementById("onSubmit").innerHTML = "Your object has firs name: " + person.firstname + " and last name: " + person.lastname;
	} else {
		return;
	}
}

function man(firstname, lastname, age, eyecolor) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
	this.eyecolor = eyecolor;
}

var person1 = new man ("Basha", "Manik", 45, "brown");

// document.createElement("p").appendChild(document.createTextNode(location.assign("http://www.abc.com")));