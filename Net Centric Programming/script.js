function submitSignup() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var phone = document.getElementById("phone").value;
    var qualification = document.getElementById("qualification").value;
    var birthday = document.getElementById("birthday").value;
    var password = document.getElementById("password").value;
    var repassword = document.getElementById("repassword").value;
    var mailRegex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var nameRegex = /^[a-zA-Z ]+$/;
    var phoneRegex = /^\d{10}$/;
    var qualRegex = /^[a-zA-Z ]+$/;
    var passwordRegex = /^[A-Za-z]\w{8,20}$/;

    if (name == "" || !nameRegex.test(name)) {
        document.getElementById("error-name").innerHTML =
            " Please Enter Your Name *";
    } else {
        document.getElementById("error-name").innerHTML = "";
        if (email == "" || !mailRegex.test(email)) {
            document.getElementById("error-email").innerHTML =
                " Please Enter Your e-mail *";
        } else {
            document.getElementById("error-email").innerHTML = "";
            if (phone == "" || !phoneRegex.test(phone)) {
                document.getElementById("error-phone").innerHTML =
                    " Please Enter Your Phone *";
            } else {
                document.getElementById("error-phone").innerHTML = "";
                if (qualification == "" || !qualRegex.test(qualification)) {
                    document.getElementById("error-qualification").innerHTML =
                        " Please Enter Your Qualification *";
                } else {
                    document.getElementById("error-qualification").innerHTML = "";
                    if (birthday == "") {
                        document.getElementById("error-birthday").innerHTML =
                            " Please Enter Your Birthday *";
                    } else {
                        document.getElementById("error-birthday").innerHTML = "";
                        if (password == "") {
                            document.getElementById("error-password").innerHTML =
                                " Please Click Generate Password *";
                        } else {
                            document.getElementById("error-password").innerHTML = "";
                            if (repassword == "") {
                                document.getElementById("error-repassword").innerHTML =
                                    " Please Click Generate Password *";
                            } else {
                                document.getElementById("error-repassword").innerHTML = "";
                                if (password != repassword) {
                                    document.getElementById("error-password").innerHTML =
                                        " Passwords do not match *";
                                    document.getElementById("error-repassword").innerHTML =
                                        " Passwords do not match *";
                                } else {
                                    document.getElementById("error-password").innerHTML = "";
                                    document.getElementById("error-repassword").innerHTML = "";
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

function getPassword() {
    var chars =
        "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()_+=-<>{}[]";
    var passwordLength = 20;
    var password = "";
    for (var i = 0; i < passwordLength; i++) {
        var random = Math.floor(Math.random() * chars.length);
        password += chars.substring(random, random + 1);
    }
    document.getElementById("password").value = password;
    document.getElementById("repassword").value = password;
    alert(" password set as " + password);
}

function saveData() {
    submitSignup();
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;

    var password = document.getElementById("password").value;
    document.cookie = "name=" + name + ";";
    document.cookie = "email=" + email + ";";
    document.cookie = "password=" + password + ";";
    var x = document.cookie;
    alert(x);
}

function getCookiesMap(cookiesString) {
    return cookiesString
        .split(";")
        .map(function(cookieString) {
            return cookieString.trim().split("=");
        })
        .reduce(function(acc, curr) {
            acc[curr[0]] = curr[1];
            return acc;
        }, {});
}

function readData() {
    var cookies = getCookiesMap(document.cookie);
    var cookieName = cookies["name"];
    var cookieEmail = cookies["email"];
    var cookiePassword = cookies["password"];
    alert("Hi " + cookieName + " !!");
    document.getElementById("loginName").value = cookieEmail;
    document.getElementById("loginPassword").value = cookiePassword;
}

function resetData() {
    if (confirm("Do you want to RESET?") == true) {
        document.getElementById("name").value = "";
        document.getElementById("email").value = "";
        document.getElementById("phone").value = "";
        document.getElementById("qualification").value = "";
        document.getElementById("birthday").value = "";
        document.getElementById("password").value = "";
        document.getElementById("repassword").value = "";
        alert("Data Reset Successful");
    } else {
        alert("Document Reset Cancelled");
    }
}