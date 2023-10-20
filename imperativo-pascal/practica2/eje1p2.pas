// Implementar un programa que invoque a los siguientes módulos.
// a. Un módulo recursivo que permita leer una secuencia de caracteres terminada en punto, los
// almacene en un vector con dimensión física igual a 10 y retorne el vector.
// b. Un módulo que reciba el vector generado en a) e imprima el contenido del vector.
// c. Un módulo recursivo que reciba el vector generado en a) e imprima el contenido del vector..
// d. Un módulo recursivo que permita leer una secuencia de caracteres terminada en punto y
// retorne la cantidad de caracteres leídos. El programa debe informar el valor retornado.
// e. Un módulo recursivo que permita leer una secuencia de caracteres terminada en punto y
// retorne una lista con los caracteres leídos.
// f. Un módulo recursivo que reciba la lista generada en e) e imprima los valores de la lista en el
// mismo orden que están almacenados.
// g. Implemente un módulo recursivo que reciba la lista generada en e) e imprima los valores de
// la lista en orden inverso al que están almacenados.

program eje1cicio1;

const 
 dimf = 10;
 
type

 rango = 1..dimf;

 vector = array [rango] of char;
 
 lista = ^nodo;
  nodo = record
  dato:char;
  sig:lista;
 end;
 
 
procedure leerChar (var c:char);
begin
 writeln('ingrese el caracter');
 readln(c);
end;

procedure cargarVector(var v:vector;var diml:integer);
var
 c:char;
begin
 leerChar(c);
 if(diml < dimf) and (c <> '.') then begin
  diml:= diml + 1;
  v[diml]:= c;
  cargarVector(v,diml);
 end;
end;

procedure imprimirVector(v:vector;diml:integer);
var
i:integer;
begin
 for i:= 1 to diml do 
  writeln(v[i]);
end;

procedure imprimirVectorRecursiva(v:vector;diml:integer);
begin
 if(diml <> 0) then  begin
  imprimirVectorRecursiva(v,diml-1);
  writeln(v[diml]);
 end;
end;


procedure leerSecuenciaRecursiva(var cant:integer);
var
c:char;
begin
 leerChar(c);
 if(c <> '.') then begin
  cant:=cant+1;
  leerSecuenciaRecursiva(cant);
 end;
end;

procedure agregarAtras(var pri,ult:lista;c:char);
var
 aux:lista;
begin
 new(aux);
 aux^.dato := c;
 aux^.sig:=nil;
 if (pri = nil) then 
  pri:=aux
  Else
  ult^.sig:=aux;
 ult:=aux;
end;

procedure cargarListaRecursiva(var pri,ult:lista;var c:char);
begin
 if(c <> '.') then begin 
  agregarAtras(pri,ult,c);
  leerChar(c);
  cargarListaRecursiva(pri,ult,c);
 end;
end;

procedure impresionRecursivaLista(pri:lista);
begin
 if(pri <> nil) then begin 
  writeln(pri^.dato);
  pri:= pri^.sig;
  impresionRecursivaLista(pri);
 end;
end;


procedure impresionRecursivaListaInversa(pri:lista);
begin
 if(pri <> nil) then begin 
  impresionRecursivaListaInversa(pri^.sig);
  writeln(pri^.dato);
 end;
end;

Var 
  dimL,cant: integer;
  V: vector;
  pri,ult: lista;
  C: char;
begin
 dimL := 0;
 cargarVector(V,dimL);
 imprimirVector(V,dimL);
 imprimirVectorRecursiva(V,dimL);
 cant := 0;
 leerSecuenciaRecursiva(cant);
 WriteLn('Se leyeron ',cant,' caracteres');
 pri := Nil;
 leerChar(C);
 cargarListaRecursiva(pri,ult,C);
 impresionRecursivaLista(pri);
 impresionRecursivaListaInversa(pri);
End.    
    


    







 
   







   








  







 
 
  





 










 
 
 
 
 
  
 
 
 
 
 
