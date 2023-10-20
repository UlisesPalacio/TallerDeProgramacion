program ejercicio4;
// 4.- Escribir un programa con:
// a. Un módulo recursivo que retorne un vector de 20 números enteros “random” mayores a 0 y
// menores a 100.
// b. Un módulo recursivo que devuelva el máximo valor del vector.
// c. Un módulo recursivo que devuelva la suma de los valores contenidos en el vector.
const
 dimf = 20;
type
 rango = 1..dimf;
 vector = array[rango] of integer;
 
procedure inicializarVector(var v:vector);
 var 
  i:rango;
begin
 for i:= 1 to dimf do 
  v[i]:=0
end;

procedure vectorRecursivo(var v:vector;var diml:integer);
var
num:integer;
begin
 num:= random(20)
 if(num > 0) and (num < 100 ) then begin
  diml:=diml +1;
  v[diml]:=num;
  vectorRecursivo(v,diml);
 end;
end;

procedure maximoNumRecursivo(v:vector;diml:integer;var maxNum:integer);
var
i:integer;
begin
  if(v[diml] > maxNum) do begin
   maxNum:=v[diml];
   maximoNumRecursivo(v,diml+1,maxNum); 
  end;  
end;

procedure sumaValoresRecursivos(v:vector;diml:integer;var cant:integer)
begin
 if(diml<=dimf) do begin
  cant:=cant + v[diml];
  sumaValoresRecursivos(v,diml+1,cant);
 end;
end;

var
v:vector;
diml:integer;
maxNum,cant:integer;
begin
 randomize()
 maxNum:=-1;
 cant:=0;
 inicializarVector(v)
 vectorRecursivo(v,diml);
 maximoNumRecursivo(v,diml,maxNum);
 sumaValoresRecursivos(v,diml,cant);
end.



    















  
  









   
 
 
