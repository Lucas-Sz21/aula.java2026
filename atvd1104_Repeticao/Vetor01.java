void main(){

    var num = new int [5];
    
    for(int contador = 0; contador < 5; contador++)
        num[contador] = Integer.parseInt(IO.readln(" Digite o " + (contador+1) + " numero: "));
        System.out.println("Estes foram os números digitados: " + num[contador]);

    for(contador = 0; contador < 5; contador++)
        IO.print("Posição " + (contador) + " numero " + num[contador]);
}