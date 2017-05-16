var __slice = [].slice;

(function($, window) {
	var Starrr;

	Starrr = (function() {
		Starrr.prototype.defaults = {
			rating : void 0,
			numStars : 5,
			change : function(e, value) {
			}
		};

		function Starrr($el, options) {
			var i, _, _ref, _this = this;

			this.options = $.extend({}, this.defaults, options);
			this.$el = $el;
			_ref = this.defaults;
			for (i in _ref) {
				_ = _ref[i];
				if (this.$el.data(i) != null) {
					this.options[i] = this.$el.data(i);
				}
			}
			this.createStars();
			this.syncRating();
			this.$el.on('mouseover.starrr', 'i', function(e) {
				return _this.syncRating(_this.$el.find('i').index(
						e.currentTarget) + 1);
			});
			this.$el.on('mouseout.starrr', function() {
				return _this.syncRating();
			});
			this.$el.on('click.starrr', 'i', function(e) {
				return _this.setRating(_this.$el.find('i').index(
						e.currentTarget) + 1);
			});
			this.$el.on('starrr:change', this.options.change);
		}

		Starrr.prototype.createStars = function() {
			var _i, _ref, _results;

			_results = [];
			for (_i = 1, _ref = this.options.numStars; 1 <= _ref ? _i <= _ref
					: _i >= _ref; 1 <= _ref ? _i++ : _i--) {
				_results.push(this.$el.append("<i class='fa fa-star-o'></i>"));
			}
			return _results;
		};

		Starrr.prototype.setRating = function(rating) {
			if (this.options.rating === rating) {
				rating = void 0;
			}
			this.options.rating = rating;
			this.syncRating();
			return this.$el.trigger('starrr:change', rating);
		};

		Starrr.prototype.syncRating = function(rating) {
			var i, _i, _j, _ref;

			rating || (rating = this.options.rating);
			if (rating) {
				for (i = _i = 0, _ref = rating - 1; 0 <= _ref ? _i <= _ref
						: _i >= _ref; i = 0 <= _ref ? ++_i : --_i) {
					this.$el.find('i').eq(i).removeClass('fa-star-o').addClass(
							'fa-star');
				}
			}
			if (rating && rating < 5) {
				for (i = _j = rating; rating <= 4 ? _j <= 4 : _j >= 4; i = rating <= 4 ? ++_j
						: --_j) {
					this.$el.find('i').eq(i).removeClass('fa-star').addClass(
							'fa-star-o');
				}
			}
			if (!rating) {
				return this.$el.find('i').removeClass('fa-star').addClass(
						'fa-star-o');
			}
		};

		return Starrr;

	})();
	return $.fn.extend({
		starrr : function() {
			var args, option;

			option = arguments[0], args = 2 <= arguments.length ? __slice.call(
					arguments, 1) : [];
			return this.each(function() {
				var data;

				data = $(this).data('star-rating');
				if (!data) {
					$(this).data('star-rating',
							(data = new Starrr($(this), option)));
				}
				if (typeof option === 'string') {
					return data[option].apply(data, args);
				}
			});
		}
	});
})(window.jQuery, window);

$(function() {
	return $(".starrr").starrr();
});


$(document).ready(function() {

	$('#stars').on('starrr:change', function(e, value) {
		$('#count').html(value);
		var movieid = window.location.pathname.split('/')[2];
		$.ajax({
			type:"POST",
			url:"/movies/rating/"+movieid+"/"+value,
			success: function(data){
				if(data=="FAIL")
					window.location.href="/login";
				console.log(data);
			},
			error: function (){
			}
		})
	});

	$('#stars-existing').on('starrr:change', function(e, value) {
		$('#count-existing').html(value);
	});

	$("#movie-like").click(function(value) {
		var value = document.getElementById("favourite").value;
		if (value == "red") {
			document.getElementById("favourite").value = "white";
		}
		if (value == "white") {
			document.getElementById("favourite").value = "red";
		}
		$(this).toggleClass('red');

		var toggleFavourite = {
			value : document.getElementById("favourite").value
		}
		var movieid = window.location.pathname.split('/')[2];
		$.ajax({
			type : "POST",
			url : "/movies/"+movieid+"/toggleFavourite" ,
			data : toggleFavourite,
			success : function(result) {
				console.log("SUCCESS");
			},
			error : function(result) {
				console.log('ERROR');
			}
		});
	});
	
	$(function() {
		
		
	    $('#toggle-event').change(function() {
	    	var toggleNewsLetter= {
	    			value : $(this).prop('checked')
	    	}
	      $('#console-event').html('Toggle: ' + $(this).prop('checked'))
	      $.ajax({
				type : "POST",
				url : "/newsletter" ,
				data : toggleNewsLetter,
				success : function(result) {
					console.log("SUCCESSFULL NEWSLETTER ");
				},
				error : function(result) {
					console.log('ERROR');
				}
			});
	    })
	  })
	  
	  $(".review").click(function(value) {
			//var value = document.getElementById("favouriteReview").value;
			
			var reviewId = $(this).attr('id');
			var value = $(this).parent()[0].value
			console.log($(this).parent().children()[1].innerHTML);
			var reviewCount = parseInt($(this).parent().children()[1].innerHTML);
			console.log(reviewCount);
			console.log("review Id "+reviewId)
			
		
			if (value == "red") {
				$(this).parent().children()[1].innerHTML =parseInt($(this).parent().children()[1].innerHTML) - 1; 
				$(this).parent()[0].value = "white";
			}
			if (value == "white") {
				
				$(this).parent().children()[1].innerHTML =parseInt($(this).parent().children()[1].innerHTML) + 1; 
				$(this).parent()[0].value = "red";
			}
			$(this).toggleClass('red');

			var toggleFavouriteReview = {
				value : $(this).parent()[0].value,
				reviewId : reviewId
			}
			var movieid = window.location.pathname.split('/')[2];
			$.ajax({
				type : "POST",
				url : "/review/"+reviewId+"/toggleFavourite" ,
				data : toggleFavouriteReview,
				success : function(result) {
					console.log("YOLO")
					console.log("SUCCESS");
				},
				error : function(result) {
					console.log('ERROR');
				}
			});
		});
	
	
	
});