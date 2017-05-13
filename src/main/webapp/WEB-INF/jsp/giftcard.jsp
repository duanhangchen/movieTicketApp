<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/gift.css" />" rel="stylesheet">
<title>Giftcard Purchase</title>

<style>
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 550px}
        
    /* On small screens, set height to 'auto' for the grid */
    @media screen and (max-width: 767px) {
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>
<h1>Giftcard Purchase</h1>
<form method="post">

	<div class="container-fluid">
	  <div class="row content">
	    
	    <br>
	    
	    <div class="col-sm-12">
	      <div class="well">
	        <h3 class="heading"><strong>SELECT </strong> CARD <strong>TYPE </strong> <span></span></h3>
	        <br>
			<input 
			  type="radio" name="card"
			  id="g1" class="input-hidden" />
			<label for="g1">
			  <img
			  src="http://i.imgur.com/2ZmDX2i.png" 
			    alt="gift1" />
			</label>
			<input 
			  type="radio" name="card" 
			  id="g2" class="input-hidden" />
			<label for="g2">
			  <img src="http://i.imgur.com/OQ4Gutr.png" 
			    alt="gift2" />
			</label>
			<input 
			  type="radio" name="card" 
			  id="g3" class="input-hidden" />
			<label for="g3">
			  <img src="http://i.imgur.com/iXC7OVu.png" 
			    alt="gift3" />
			</label>
			<input 
			  type="radio" name="card"
			  id="g4" class="input-hidden" />
			<label for="g4">
			  <img
			  src="http://i.imgur.com/OQ4Gutr.png" 
			    alt="gift4" />
			</label>
			<br>
			<br>
			<br>
	      </div>
	      
	      <div class="row">
	        <div class="col-sm-4">
	          <div class="well">
	            <div class="container">
					<div class="row">
				    <div class="col-md-4">
						<div class="form_main">
				        	<h4 class="heading"><strong>Customize </strong> Card <span></span></h4>
			                <div class="form">
			                	<input type="radio" name="giftAmount" value="25" checked> $25
							    <input type="radio" name="giftAmount" value="50"> $50
							    <input type="radio" name="giftAmount" value="75"> $75
			                	<input type="radio" name="giftAmount" value="100"> $100
							    <input type="radio" name="giftAmount" value="150"> $150
							    <input type="radio" name="giftAmount" value="200"> $200
			                	
			                    <input type="text" required="" placeholder="Please input recipient Name" value="" name="giftTo" class="txt">
			                    <input type="text" required="" placeholder="Please input sender Name" value="" name="giftFrom" class="txt">
			                    <input type="text" required="" placeholder="Please input recipient Email" value="" name="giftEmail" class="txt">
			                    
			                	<textarea placeholder="Message to Recipient" name="giftMsg" type="text" class="txt_3"></textarea>
			                     
			                
				            </div>
				            </div>
				            </div>
					</div>
				</div>
				
	          </div>
	        </div>
	        <div class="col-sm-4">
	          <div class="well">
	            <div class="container">
				    <div class="row">
				        <div class="col-xs-12 col-md-4">
				            <div class="panel panel-default">
				                <div class="panel-heading">
				                    <h3 class="panel-title">
				                        Payment Details
				                    </h3>
				                </div>
				                <div class="panel-body">
				                 
				                    <div class="form-group">
				                        <label for="cardNumber">
				                            CARD NUMBER</label>
				                        <div class="input-group">
				                            <input type="text" class="form-control" name="cardNumber" placeholder="Valid Card Number"
				                                required autofocus />
				                            <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
				                        </div>
				                    </div>
				                    <div class="row">
				                        <div class="col-xs-7 col-md-7">
				                            <div class="form-group">
				                                <label for="expityMonth">
				                                    EXPIRY DATE</label>
				                                <div class="col-xs-6 col-lg-6 pl-ziro">
				                                    <input type="text" class="form-control" id="expityMonth" placeholder="MM" required />
				                                </div>
				                                <div class="col-xs-6 col-lg-6 pl-ziro">
				                                    <input type="text" class="form-control" id="expityYear" placeholder="YY" required /></div>
				                            </div>
				                        </div>
				                        <div class="col-xs-5 col-md-5 pull-right">
				                            <div class="form-group">
				                                <label for="cvCode">
				                                    CV CODE</label>
				                                <input type="password" class="form-control" id="cvCode" placeholder="CV" required />
				                            </div>
				                        </div>
				                    </div>
				                    
				                </div>
				            </div>
				            <br/>
				            <input type="submit" value="Pay" name="submit" class="btn btn-success btn-lg btn-block">
				        </div>
				    </div>
				</div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</div>

</form>
</body>
</html>