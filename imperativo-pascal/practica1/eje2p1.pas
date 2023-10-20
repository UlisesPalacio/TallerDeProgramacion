program eje2p2;

const 
  dimf = 300;

type
  rango = 1..dimf;
  oficina = record
    cod: rango;
    dni: integer;
    valor: real;
  end;

  vector = array[1..dimf] of oficina;

procedure cargarOficinas(var v: vector; var diml: integer);
procedure leerOficina(var o: oficina);
begin
  with o do begin
    writeln('ingrese el codigo de oficina');
    readln(cod);
    if (cod <> -1) and (diml < dimf) then begin
      writeln('ingrese el dni del empleado');
      readln(dni);
      writeln('ingrese el valor de la empresa');
      readln(valor);
    end;
  end;
end;

var
  o: oficina;
begin
  diml := 0;
  leerOficina(o);
  while (o.cod <> -1) and (diml < dimf) do begin
    diml := diml + 1;
    v[diml] := o;
    leerOficina(o);
  end;
end;

procedure insercion(var v: vector; diml: rango);
var 
  i, j: rango;
  actual: oficina;
begin
  for i := 2 to diml do begin
    actual := v[i];
    j := i - 1;
    while (j > 0) and (v[j].cod > actual.cod) do begin
      v[j + 1] := v[j];
      j := j - 1;
    end;
    v[j + 1] := actual;
  end;
end;

procedure seleccion(var v: vector; dimL: rango);
var
  i, j, p: rango;
  item: oficina;
begin
  for i := 1 to dimL - 1 do begin
    p := i;
    for j := i + 1 to dimL do
      if v[j].cod < v[p].cod then
        p := j;

    item := v[p];
    v[p] := v[i];
    v[i] := item;
  end;
end;

var
  v: vector;
  diml: rango;
begin
  cargarOficinas(v, diml);
  insercion(v, diml);
  seleccion(v, diml);
end.






































