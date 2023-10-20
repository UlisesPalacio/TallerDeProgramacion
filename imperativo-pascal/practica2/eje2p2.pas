// Realizar un programa que lea números hasta leer el valor 0 e imprima, para cada número
// leído, sus dígitos en el orden en que aparecen en el número. Debe implementarse un módulo
// recursivo que reciba el número e imprima lo pedido. Ejemplo si se lee el valor 256, se debe
// imprimir 2 5 6

program ejercicio2;

procedure procesar();
 procedure imprimirDigitos(num:integer);
 begin
  if(num <> 0) then begin
   imprimirDigitos(num div 10);
   writeln(num mod 10);
  end;
 end;
 
var 
 num:integer;
 begin
 writeln('ingrese el numero...');
 readln(num);
 if(num <> 0) then begin
  imprimirDigitos(num);
  procesar();
 end;
end;

begin
procesar();
end.




  
