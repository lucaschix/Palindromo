# Palindromo

function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}

el metodo en js analiza una cadena de texto devolviendo true si es un palindromo y false si no lo es, mediante el .split divide la cadena un una lista de caracteres los cuales invierte su orden utilizando el .reverse y lo compara con la cadena original.

- Caso de prueba 1:

Input: 200 (número entero)

Output: ????

- Caso de prueba 2:

Input: “” (cadena vacía)

Output: ????

- Caso de prueba 3:

Input: “aaabccbaaa”

Output: ????

- Caso de prueba 4:

Input: “ahabccbaaa”

Output: ????

- Caso de prueba 5:

Input: “La tele letal”

Output: ????
