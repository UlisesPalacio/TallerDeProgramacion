eje3p2;
{ 3:Netflix ha publicado la lista de películas que estarán disponibles durante el mes de
diciembre de 2022. De cada película se conoce: código de película, código de género (1: acción,
2: aventura, 3: drama, 4: suspenso, 5: comedia, 6: bélico, 7: documental y 8: terror) y puntaje
promedio otorgado por las críticas.
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Lea los datos de películas, los almacene por orden de llegada y agrupados por código de
género, y retorne en una estructura de datos adecuada. La lectura finaliza cuando se lee el
código de la película -1."
b. Genere y retorne en un vector, para cada género, el código de película con mayor puntaje
obtenido entre todas las críticas, a partir de la estructura generada en a)..
c. Ordene los elementos del vector generado en b) por puntaje utilizando alguno de los dos
métodos vistos en la teoría.
d. Muestre el código de película con mayor puntaje y el código de película con menor puntaje,
del vector obtenido en el punto c).}
type

 rango=1..8;
 pelicula = record
  cod_peli:integer;
  cod_genero:rango;
  puntaje_promedio:real;
 end;
 
 lista =^nodo
 nodo = record
  dato:pelicula;
  sig:lista;
 end;
 
procedure leerPelicula(var p:pelicula;);
begin
 with p do begin
  writeln('ingrese el codigo de pelicula');
  readln(cod_peli);
  if(cod_peli <> -1) then begin
   writeln('ingrese el codigo de genero');
   readln(cod_genero);
   writeln('ingrese el puntaje promedio');
   readln(puntaje_promedio);
  end;
 end;
end;

procedure agregarAdelante(var pri:lista;cod_genero:rango);
var
	aux:lista;
begin
	new(aux);
	aux^.cod:= cod_genero;
	aux^.sig:= pri;
	pri:= aux;
end;





    
 
 
 
 
 
 
 
  
  
  


