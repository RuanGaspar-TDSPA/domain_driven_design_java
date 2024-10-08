
// uma varíavel não precisa ser declarada e pode assumir qualquer qualquer formato, como vemos abaixo:
//var num1;   
//num1 = 1
//num1 = "casa"

//let num2;

//num3 = 3

// Constantes assumem valor fixo no código, como o próprio nome diz. 
// const pi = 3.14

//nome, n0me, noMe, nomE, NOME

// Em function somar() estamos usando operadores aritméticos para realizar a função.
// Operadores aritméticos: + - * / \\ % ** ++ -- 
// Lógicos && || !
// Comparação > < >= <= != == === 
// Atribução += -= *= /= 


function boasVindas() {
    // alert("Seja Bem-Vindo!");
    // document.write("Seja bem vindo!");
}
function somar() {
    //Valor1 = parseInt(document.frmCalc.txtValor1.value);
    //Valor2 = parseInt(document.getElementById("txtValor2").value);

    //Valor01 = document.getElementById("txtValor1");
    //Valor02 = document.getElementById("txtValor2");

    Valor01 = document.getElementById("txtValor1");
    Valor02 = document.getElementById("txtValor2");
    result = document.getElementById("result");

    if (Valor01.value == "" || Valor02.value == "") {
        alert("Campo obrigatório");
        if (Valor01.value == "") {
            Valor01.focus();
        }
        if (Valor02.value == "") {
            Valor02.focus();
        }
        return false;
    }

    soma = parseInt(Valor01.value) + parseInt(Valor02.value);
    result.innerText = soma;
    //document.write(soma);
}   