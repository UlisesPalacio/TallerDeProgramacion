// Escribir un programa que:
// a. Implemente un módulo recursivo que genere una lista de números enteros “random”
// mayores a 0 y menores a 100. Finalizar con el número 0.
// b. Implemente un módulo recursivo que devuelva el mínimo valor de la lista.
// c. Implemente un módulo recursivo que devuelva el máximo valor de la lista.
// d. Implemente un módulo recursivo que devuelva verdadero si un valor determinado se
// encuentra en la lista o falso en caso contrario.

program ejercicio3;

type
 lista = ^nodo;
  nodo = record
  dato : integer;
  sig:lista;
 end;
 
procedure agregarAdelante(var pri:lista;num:integer);
var
nue:lista;
begin
 new(nue);
 nue^.dato:=num;
 nue^.sig:= pri;
 pri:=nue;
end;

procedure generarListaRecursiva(var pri:lista);
var
num:integer;
begin
 num:=random(100);
 if(num <> 0) then begin
  agregarAdelante(pri,num);
  generarListaRecursiva(pri);
 end;
end;

procedure imprimirLista(pri:lista);
begin
 if(pri <> nil) then begin
  writeln(pri^.dato);
  imprimirLista(pri^.sig);
 end;
end;

function buscarMinimo(pri:lista;min:integer):integer;
begin
 if(pri=nil) then //llegue al final de la lista
 buscarMinimo:= min
 else begin
  if(pri^.dato < min) then //compruebo si es el minimo
   min:=pri^.dato;
   //actualizo el minimo
  buscarMinimo:= buscarMinimo(pri^.sig,min);
  //llamo recursivamente a la funcion
  end;
end;

function buscarMaximo(pri:lista;max:integer):integer;
begin
 If (pri = Nil) Then //llegué al final de la lista
    buscarMaximo := max //retorno el mínimo
  Else
    Begin
      If (pri^.dato > max) Then //compruebo si es el minimo
        max := pri^.dato ;
      //actualizo el minimo
      buscarMaximo := buscarMaximo(pri^.sig,max);
      // llamo recursivamente a la funcion
    End;

end;

Function buscarValor (pri:lista; num:integer): Boolean;
Begin
  If (pri=Nil) Then
    buscarValor := false
  Else
    Begin
      If (pri^.dato = num) Then
        buscarValor := true
      Else
        buscarValor := buscarValor(pri^.sig,num);
    End;
End;

Var 
  pri: lista;
  min,max, num: integer;
Begin
  pri := Nil;
  min := 100;
  max := 0;
  Randomize;
  generarListaRecursiva(pri);
  imprimirLista(pri);
  writeln('El minimo es: ',buscarMinimo(pri,min));
  writeln('El maximo es: ',buscarMaximo(pri,max));
  Write('Ingrese valor a buscar...');
  ReadLn(num);
  WriteLn(buscarValor(pri,num));
End.
  
   
    
      




 
   
