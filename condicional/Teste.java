void main () {

    int year = Integer.parseInt(IO.readln("Informe o ano desejado para conferência: "));
    if (year % 4 == 0)
        IO.println(year + " é bissexto");
}