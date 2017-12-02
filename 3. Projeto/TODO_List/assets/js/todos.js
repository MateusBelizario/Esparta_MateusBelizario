//Check das tarefas realizadas
$("ul").on("click", "li", function(){
	$(this).toggleClass("completed");
});

//Clicar no x e deletar tarefa
$("ul").on("click", "span",function(event){
	$(this).parent().fadeOut(500, function(){
		$(this).remove();
	});
	event.stopPropagation();
});

//Criar nova tarefa
$("input[type = 'text']").keypress(function(event){
	if(event.which === 13){
		//Salvando o valor do input
		var todoText = $(this).val();
		$(this).val("");
		//Criar um novo li e adicionar ao ul
		$("ul").append("<li><span><i class='fa fa-trash'></i></span> " + todoText + "</li>");
	}
});

//Esconder ou mostrar Add Todo
$(".fa-plus").click(function(){
	$("input[type = 'text']").fadeToggle();
});
