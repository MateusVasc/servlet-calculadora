<html>
<body>
	<form action="solicitarCalculo" method="post">
        <label for="numero1">Número 1:</label>
        <input type="number" id="numero1" name="numero1">
        <br>
        <label for="numero2">Número 2:</label>
        <input type="number" id="numero2" name="numero2">
        <br>
        <label for="soma">Somar</label>
        <input type="radio" id="soma" name="escolha" value="soma">
        <label for="subtracao">Subtrair</label>
        <input type="radio" id="subtracao" name="escolha" value="subtracao">
        <label for="divisao">Dividir</label>
        <input type="radio" id="divisao" name="escolha" value="divisao">
        <label for="multiplicacao">Multiplicar</label>
        <input type="radio" id="multiplicacao" name="escolha" value="multiplicacao">
        <br> 
        <input type="submit" value="Calcular">
    </form>
</body>
</html>
