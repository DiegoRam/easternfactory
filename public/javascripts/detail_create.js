
var currentDetail = 1;

var setDate = function() {
	var tmp = $('#dp2').val().split('/');
	var newDate = tmp[2] + '-' + tmp[1] + '-' + tmp[0] + 'T' + $('#time').val() + ':00';
};

var removeDetail = function(id) {
	$('#item_' + id).remove();
};

$(function() {
	
	$('#addDetail').click(function(e) {
		e.preventDefault();
		
		var removeLink = ' <a href="javascript:;" class="remove icon-remove" onclick="removeDetail(' + (currentDetail - 1) + ')"></a>' ;
		$('#detailList .item .row:last').append(removeLink)
		var html = $('#detailTemplate').clone().html().replace(/\$ID/g, currentDetail);
		$('#detailList .item:last').after(html);
		currentDetail++;
		
		$('#detailList .item:last input:first').focus();
	});
	
	$('#dp2').change(setDate);
	$('form').submit(setDate);
});