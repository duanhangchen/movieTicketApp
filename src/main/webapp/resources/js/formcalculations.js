
 var filling_prices= new Array();
 filling_prices["0"]=0;
 filling_prices["1"]=11.99;
 filling_prices["2"]=23.98;
 filling_prices["3"]=35.97;
 filling_prices["4"]=47.96;
 filling_prices["5"]=59.95;
 filling_prices["6"]=71.94;
 filling_prices["7"]=83.93;
 filling_prices["8"]=95.92;
 filling_prices["9"]=107.91;
 
 var filling_prices2= new Array();
 filling_prices2["0"]=0;
 filling_prices2["1"]=10.49;
 filling_prices2["2"]=20.98;
 filling_prices2["3"]=31.47;
 filling_prices2["4"]=41.96;
 filling_prices2["5"]=52.45;
 filling_prices2["6"]=62.94;
 filling_prices2["7"]=73.43;
 filling_prices2["8"]=83.92;
 filling_prices2["9"]=94.41;

 var filling_prices3= new Array();
 filling_prices3["0"]=0;
 filling_prices3["1"]=8.99;
 filling_prices3["2"]=17.98;
 filling_prices3["3"]=26.97;
 filling_prices3["4"]=35.96;
 filling_prices3["5"]=44.95;
 filling_prices3["6"]=53.94;
 filling_prices3["7"]=62.93;
 filling_prices3["8"]=71.92;
 filling_prices3["9"]=80.91;
 
	 
	 
// getCakeSizePrice() finds the price based on the size of the cake.
// Here, we need to take user's the selection from radio button selection
//This function finds the filling price based on the 
//drop down selection
function getFillingPrice()
{
    var cakeFillingPrice=0;
    //Get a reference to the form id="cakeform"
    var theForm = document.forms["cakeform"];
    //Get a reference to the select id="filling"
     var selectedFilling = theForm.elements["adult"];
     
    //set cakeFilling Price equal to value user chose
    //For example filling_prices["Lemon".value] would be equal to 5
    cakeFillingPrice = filling_prices[selectedFilling.value];

    //finally we return cakeFillingPrice
    return cakeFillingPrice;
}

function getFillingPrice2()
{
    var cakeFillingPrice2=0;
    //Get a reference to the form id="cakeform"
    var theForm = document.forms["cakeform"];
    //Get a reference to the select id="filling"
    var selectedFilling2 = theForm.elements["senior"];
     
    //set cakeFilling Price equal to value user chose
    //For example filling_prices["Lemon".value] would be equal to 5
    cakeFillingPrice2 = filling_prices2[selectedFilling2.value];

    //finally we return cakeFillingPrice
    return cakeFillingPrice2;
}

function getFillingPrice3()
{
    var cakeFillingPrice3=0;
    //Get a reference to the form id="cakeform"
    var theForm = document.forms["cakeform"];
    //Get a reference to the select id="filling"
    var selectedFilling3 = theForm.elements["child"];
     
    //set cakeFilling Price equal to value user chose
    //For example filling_prices["Lemon".value] would be equal to 5
    cakeFillingPrice3 = filling_prices3[selectedFilling3.value];

    //finally we return cakeFillingPrice
    return cakeFillingPrice3;
}


        
function calculateTotal()
{
    //Here we get the total price by calling our function
    //Each function returns a number so by calling them we add the values they return together
    var cakePrice =  getFillingPrice() + getFillingPrice2() + getFillingPrice3();
    
    //display the result
    var divobj = document.getElementById('totalPrice');
    divobj.style.display='block';
    divobj.innerHTML = "Total Price For the Tickets $"+cakePrice;

}

function hideTotal()
{
    var divobj = document.getElementById('totalPrice');
    divobj.style.display='none';
}