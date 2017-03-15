// script for Adresar


$(document).ready(function(){

// datepicker
    $( "#datepicker" ).datepicker({
      showOtherMonths: true,
      selectOtherMonths: true,
      changeMonth: true,
      changeYear: true,
      yearRange: "c-100:c+00",
      dateFormat: "mm.dd.yy."
    });


$("input").blur(function(){
    markRequiredField(this);
    /*
    var inputValue = getInputValue(this.value);
    var checkInput = inputValue.length;
    if (checkInput === 0){
        $(this).parent("div").addClass("has-error");
        $(this).prev("div").removeClass("hide");
    } else {
        $(this).parent("div").removeClass("has-error");
        $(this).prev("div").addClass("hide");
    }*/
    //alert("upisano =" + inputValue);
    //alert("length =" + checkInput);
    //checkInputs(this);
});

$("form").submit(function(event) {

    var arrayAllInput = [];
    $(".required").val(function(i, value) {
        //markRequiredField(this);
        if (this.value !== "") {
        arrayAllInput.push(value)
        }
    });

    if (arrayAllInput.length < 2) {
    event.preventDefault();
    $("input").each(function() {
        markRequiredField(this);
    });
    }
});

/*
function checkSubmit(required){
    if (required === undefined) {
        throw "required is undefined";
    }
    var checkRequired
    $(this).parent("div").addClass("has-error");
    $(this).prev("div").removeClass("hide");
}*/

function markRequiredField(mark) {
    if (mark === undefined) {
        throw "mark is undefined";
    }
    var inputValue = getInputValue(mark.value);
    var checkInput = inputValue.length;
    if (checkInput === 0 && $(mark).hasClass("required")) {
        $(mark).parent("div").addClass("has-error");
        $(mark).prev("div").removeClass("hide");
    } else {
        $(mark).parent("div").removeClass("has-error");
        $(mark).prev("div").addClass("hide");

    }
}

function getInputValue(value) {
    if(value !== undefined) {
        return value;
    }else{
    return "Ne definiran property";
    }
}

});