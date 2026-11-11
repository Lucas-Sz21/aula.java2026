void main (){

    int var_a = Integer.parseInt(IO.readln("Digite o primeiro número: "));
    int var_b = Integer.parseInt(IO.readln("Digite o segundo número: "));
    if (var_a <= var_b){
         IO.println(var_b - var_a);
    }
       
    else{
        IO.println(var_a - var_b);
    }
}
