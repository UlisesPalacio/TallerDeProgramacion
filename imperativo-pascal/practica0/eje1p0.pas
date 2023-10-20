
Program ejercicio1;

Const 
  dimF = 36;
  corte = 11111;

Type 
  rango = 1..dimF;
  vector = array [rango] Of integer;
  alumno = Record
    nro: integer;
    ingreso: integer;
    cant: rango;
    materias: vectMaterias;
  End;
  lista = ^nodo;
  nodo = Record
    data: alumno;
    sig: lista;
  End;

Procedure leerMaterias(Var V: vector; cant: integer);

Var 
  i,nota: integer;
Begin
  For i:=1 To cant Do
    Begin
      WriteLn('Ingrese nota de materia ', i);
      readln(nota);
      V[i] := nota;
    End;
End;

Procedure leerAlumno (Var A:alumno);
Begin
  writeln('Ingrese numero de alumno: ');
  readln(A.nro);
  writeln('Ingrese anio de ingreso: ');
  readln(A.ingreso);
  writeln('Ingrese cantidad de materias: ');
  readln(A.cant);
  leerMaterias(A.materias,A.cant);
End;

Procedure cargarAlumno(Var pri:lista; A:alumno);

Var 
  nue: lista;
Begin
  new(nue);
  nue^.data := A;
  nue^.sig := pri;
  L := nue;
End;

Function calcularPromedio (V: vector; dimL: Integer): Real;

Var 
  i,total: Integer;
Begin
  total := 0;
  For i:= 1 To dimL Do
    total := total + V[i];
  calcularPromedio := (total / dimL);
End;

Procedure imprimirLista(pri: lista);

Begin
  While (pri<>Nil) Do
    Begin
      writeln('El promedio del alumno numero: ',pri^.data.nro,' tiene un promedio de: ',calcularPromedio(pri^.data.materias,
              pri^.data
              .cant): 4: 2);
      L := L^.sig;
    End;
End;

Procedure cargarLista(Var pri:lista);

Var 
  A: alumno;
Begin
  Repeat
    leerAlumno(A);
    cargarAlumno(pri,A);
  Until (A.nro = corte);
End;

Var 
  pri: lista;
Begin
  L := Nil;
  cargarLista(pri);
  imprimirLista(pri);
End.
