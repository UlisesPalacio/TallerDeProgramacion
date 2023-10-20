// 3. Implementar un programa que contenga:

// a. Un módulo que lea información de alumnos de Taller de Programación y los almacene en
// una estructura de datos. De cada alumno se lee legajo, DNI, año de ingreso y los códigos y
// notas de los finales rendidos. La estructura generada debe ser eficiente para la búsqueda por
// número de legajo. La lectura de los alumnos finaliza con legajo 0 y para cada alumno el ingreso
// de las materias finaliza con el código de materia -1.
// b. Un módulo que reciba la estructura generada en a. y retorne los DNI y año de ingreso de
// aquellos alumnos cuyo legajo sea inferior a un valor ingresado como parámetro.
// c. Un módulo que reciba la estructura generada en a. y retorne el legajo más grande.
// d. Un módulo que reciba la estructura generada en a. y retorne el DNI más grande.
// e. Un módulo que reciba la estructura generada en a. y retorne la cantidad de alumnos con
// legajo impar.
// e. Un módulo que reciba la estructura generada en a. y retorne el legajo y el promedio del
// alumno con mayor promedio.
// f. Un módulo que reciba la estructura generada en a. y un valor entero. Este módulo debe
// retornar los legajos y promedios de los alumnos cuyo promedio supera el valor ingresado.

program ejercicio3p3;

type
 cadena10 = string[10];
 final= record
  cod:integer;
  nota:integer;
 end;


lista =^nodo;
 nodo = record
 dato:final;
 sig:lista;
end; 

 alumno = record
  legajo:integer;
  dni:integer;
  anio_ingreso:integer;
  finales:lista;
 end;
 
 arbol=^nodo2;
  nodo2 = record
  dato:alumno;
  HI:arbol;
  HD:arbol;
 end;

procedure leerFinal(var f:final);
begin
 with f do begin
  writeln('ingrese el codigo de la materia');
  readln(cod);
  if(cod <> -1) then begin
   writeln('ingrese la nota de la materia');
   readln(nota);
  end;
 end;
end;
 
procedure agregarAdelante(var pri:lista;f:finales);
var
aux:lista;
begin
 new(aux);
 aux^.dato:=f;
 aux^.sig:=pri;
 pri:=aux;
end;


procedure cargarFinal(var pri:lista);
var
 f:finales;
begin
 leerFinal(f);
 while(f.cod <>-1) do begin
  cargarFinal(pri,f);
  leerFinal(f);
 end;
end;


procedure leerAlumno(var al:alumno);
 begin
  with al do begin
   writeln('ingrese el legajo del alumno');
   readln(legajo);
   if(legajo <> 0) then begin
    writeln('ingrese el dni del alumno');
    readln(dni);
    writeln('ingrese el anio de ingreso del alumno');
    readln(anio_ingreso);
    finales:=nil;
    writeln('ingrese la nota del final');
    readln(finales);
   end;
  end;
end;

procedure agregarAlumno(var a:arbol;al:alumno);
begin
 if(a = nil) then begin 
  new(a);
  a^.dato:=al;
  a^.HI:=nil;
  a^.HD:=nil;
 end;
 else if(al.legajo <= a^.dato.legajo) then
  agregarAlumno(a^.HI,al);
 else
 agregarAlumno(a^.HD,al);
end;

procedure cargarArbol(var a:arbol);
var
 al:alumno;
begin
 leerAlumno(al);
 while(al.legajo <> 0) do begin
  agregarAlumno(a,al);
  leerAlumno(al);
 end;

procedure incisoB(a:arbol; leg:integer);
begin
	if(a <> nil) then begin
		if(a^.dato.legajo < leg) then begin
			writeln('DNI', a^.dato.dni);
			writeln('Anio de ingreso', a^.dato.anio_ingreso);
			incisoB(a^.dato.HI, leg);
			incisoB(a^.dato.HD,leg);
		end
		else if(a^.dato.legajo >= leg) then 
				incisoB(a^.dato.HI,leg);
	end;				
end;

procedure incisoC(a:arbol);

 function MaxLegajo(a:arbol:integer):integer;
 begin
  if (a = nil) then MaxLegajo:=-1;
  else if(a^.HD = nil) then MaxLegajo:= a^.dato.legajo
       else MaxLegajo:= MaxLegajo(a^.HD);
 end;
 
var
 max:integer;
begin
 max:= MaxLegajo(a);
 if(max = 1-) then
  writeln('arbol sin elementos')
 else 
  writeln('el numero de socio mas grande es'max);
  
end;

procedure incisoD(a:arbol);

 function MaxDNI(a:arbol:integer):integer;
 begin
  if (a = nil) then MaxDNI:=-1;
  else if(a^.HD = nil) then MaxDNI:= a^.dato.dni
       else MaxDNI:= MaxDNI(a^.HD);
 end;
 
var
 max:integer;
begin
 max:= MaxDNI(a);
 if(max = 1-) then
  writeln('arbol sin elementos')
 else 
  writeln('el numero de DNI mas grande es'max);
  
end;

Procedure cantLegajosImpar(A: arbol);

Function cantImpares(A:arbol): Integer;
Begin
  If (A<>Nil) Then
    Begin
      If (A^.data.leg Mod 2 <> 0) Then
        cantImpares := cantImpares(A^.HI) + cantImpares(A^.HD) + 1
      Else
        cantImpares := cantImpares(A^.HI) + cantImpares(A^.HD);
    End
  Else
    cantImpares := 0;
End;

Begin
  Writeln('Hay ',cantImpares(A),' legajos impares');
End;


function calcularPromedio(pri:lista):real;
var
total,notas:integer;
begin
 total:=0;
 notas:=0;
 while(pri<>nil) do begin
  total:=total + pri^.dato.nota;
  notas:=notas + 1;
  pri:=pri^.sig;
 end;
 
 calcularPromedio:=(total/notas);
end;


procedure incisoEPromedio(a:arbol;var maxpro:real;var leg:integer);
var 
prom:real;
begin
 if(a <> nil) then begin
  prom:= calcularPromedio(a^.dato.finales);
  if(prom > maxprom) then begin
    maxprom:=prom;
    leg:=a^.dato.leg;
  end;
  incisoEPromedio(a^.HI,maxprom,leg);
  incisoEPromedio(a^.HD,maxprom,leg);
 end;  
end;

procedure incisoF(a:arbol;valor:real);
var
prom:real;
begin
 if(a <> nil) then begin
  prom:=calcularPromedio(a^.dato.finales);
  if(prom > valor) then 
   writeln('el legajo y el promedio de los alumnos que superan el valor ingresado es',a^.dato.leg,'y',prom:4:2)
  incisoF(a^.HI,valor);
  incisoF(a^.HD,valor);
 end;  
end;

procedure promedioValor(a:arbol);
var
valor:real;
begin
 writeln('ingrese el valor a comparar');
 readln(valor);
 incisoF(a,valor);
end;

var
a:arbol;
maxpro:real;
leg:integer;
pri:lista;
begin
 maxProm := -1;
 leg := -1;
 cargarFinal(prr);
 cargarArbol(a);
end.



 


 
   
   














   
 
 
 
 
       

