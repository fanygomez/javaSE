package p1;

class Earth extends  Planet{
/*
Los metodos abstractos de una clase abstracta, si no se sobrescribre
como public/protected se sobrescriben obligatoriamente.

Si el Metodo es  privado, este puede cambiar a publico o protected.
Si el Metodo es publico, solo se puede sobrescribir como public.
Si el Metodo es protected, solo se puede sobrescribir como public, protected
 */
    public void resolve() {}

    public void rotate(){}
}
