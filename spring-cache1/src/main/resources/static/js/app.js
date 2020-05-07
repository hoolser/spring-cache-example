function validate(){
	var name=document.getElementById('name');
	if(name==''){
		alert("Please enter a valid name.")
		return false;
	}
	name=document.getElementById('surname');
	if(name==''){
		alert("Please enter a valid surname.")
		return false;
	}
	name=document.getElementById('phone');
	if(name==''){
		alert("Please enter a valid phone.")
		return false;
	}
	name=document.getElementById('email');
	if(name==''){
		alert("Please enter a valid email.")
		return false;
	}
	return true;
}

function validateId(){
	var Id=document.getElementById('Id');
	if(Id==''){
		alert("Please enter a valid Id.")
		return false;
	}
	return true;
}