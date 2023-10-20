// 2. Escribir un programa que:
// a. Implemente un módulo que lea información de ventas de un comercio. De cada venta se lee
// código de producto, fecha y cantidad de unidades vendidas. La lectura finaliza con el código de
// producto 0. Un producto puede estar en más de una venta. Se pide:

//     i. Generar y retornar un árbol binario de búsqueda de ventas ordenado por código de
//     producto.

//     ii. Generar y retornar otro árbol binario de búsqueda de productos vendidos ordenado por
//     código de producto. Cada nodo del árbol debe contener el código de producto y la
//     cantidad total de unidades vendida.
//         Nota: El módulo debe retornar los dos árboles.

// b. Implemente un módulo que reciba el árbol generado en i. y un código de producto y retorne
// la cantidad total de unidades vendidas de ese producto.

// c. Implemente un módulo que reciba el árbol generado en ii. y un código de producto y retorne
// la cantidad total de unidades vendidas de ese producto.


program ejercicio2p3;

type
 venta = record
  cod_producto:integer;
  fecha:string;
  cant:integer;
 end;
 
 producto = record
  cod:interger;
  cant_uni:integer;
  
 
 arbol = ^nodo
  nodo = record
  dato:venta;
  hi:arbol;
  hd:arbol;
 end;
 
 arbolProduc = ^nodo2
  nodo2= record
  dato:producto;
  hi:arbolProduc;
  hd:arbolProduc;
 end;
 
  
 

procedure leerVenta (var v:venta);
  begin
   with v do begin
    writeln('ingrse el codigo del producto');
    readln(cod_producto);
    if(cod_producto <> 0) then begin
     writeln('ingrese la fecha de la venta');
     readln(fecha);
     writeln('ingrese la cantidad de ventas de dicho producto');
     readln(cant);
    end;
   end;
end;

procedure agregarVenta(var a:arbol;v:venta);
begin
 if(a = nil) then begin
  new(a);
  a^.dato:=v;
  a^.hi:=nil;
  a^.hd:=nil;
 end;
 else if (v.cod_producto <= a^.dato.cod_producto) then
   agregarVenta(a^.hi,v);
 else
   agregarVenta(a^.hd,v);
end;




procedure cargarVentas(var a:arbol);
var
v:venta;
begin
 leerVenta(v);
 while(v.cod_producto <> 0) do begin
  agregarVenta(a,v);
  leerVenta(v);
 end;
end;
 
  
  
  
     
    
      
