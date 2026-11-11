void main (){

    int valor_n = Integer.parseInt(IO.readln("Digite um número: "));
    if (valor_n < 0){
        IO.println("O módulo de " + valor_n + " é igual a: " + (valor_n * (-1)));
    }
    else{
        IO.println("O módulo de " + valor_n + " é igual a: " + valor_n);
    }
}