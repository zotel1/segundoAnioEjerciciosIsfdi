const pptxgen = require("pptxgenjs");
const pres = new pptxgen();
pres.layout = "LAYOUT_16x9";
pres.author = "Sigel Cristian";
pres.title = "Java, Python y C - Análisis Comparativo";

// ── PALETA ────────────────────────────────────────────────────────────────
const C = {
    bg: "0F1923",   // fondo dark principal
    bgLight: "1A2535",   // fondo cards
    bgCard: "212F3D",   // fondo código
    java: "E8A838",   // naranja Java
    python: "3A86C8",   // azul Python
    c: "5CC8A1",   // verde menta C
    white: "F0F4F8",
    gray: "8899AA",
    accent: "E8A838",
};

const makeShadow = () => ({ type: "outer", color: "000000", blur: 8, offset: 3, angle: 45, opacity: 0.25 });

// ── HELPERS ───────────────────────────────────────────────────────────────
function title(slide, txt, sub) {
    slide.addText(txt, {
        x: 0.5, y: 0.18, w: 9, h: 0.55,
        fontSize: 28, bold: true, color: C.white, fontFace: "Calibri", align: "left", margin: 0
    });
    if (sub) slide.addText(sub, {
        x: 0.5, y: 0.76, w: 9, h: 0.3,
        fontSize: 12, color: C.gray, fontFace: "Calibri", align: "left", italic: true, margin: 0
    });
    // línea sutil bajo el título (no stripe — es un separador temático del slide)
    slide.addShape(pres.shapes.RECTANGLE, {
        x: 0.5, y: 1.08, w: 9, h: 0.02, fill: { color: "2E4057" }, line: { color: "2E4057" }
    });
}

function badge(slide, txt, color, x, y) {
    slide.addShape(pres.shapes.ROUNDED_RECTANGLE, {
        x, y, w: 1.1, h: 0.28, fill: { color }, rectRadius: 0.04, line: { color }
    });
    slide.addText(txt, {
        x, y, w: 1.1, h: 0.28,
        fontSize: 10, bold: true, color: "0F1923", fontFace: "Calibri", align: "center", margin: 0
    });
}

function codeCard(slide, lang, lines, color, x, y, w, h) {
    // card background
    slide.addShape(pres.shapes.ROUNDED_RECTANGLE, {
        x, y, w, h, fill: { color: C.bgCard }, rectRadius: 0.08,
        shadow: makeShadow(), line: { color: "2E4057", width: 1 }
    });
    // language tag top-left
    badge(slide, lang, color, x + 0.12, y + 0.1);
    // code lines
    const lineH = (h - 0.52) / lines.length;
    lines.forEach((l, i) => {
        slide.addText(l, {
            x: x + 0.18, y: y + 0.48 + i * lineH, w: w - 0.3, h: lineH,
            fontSize: 9.5, color: C.white, fontFace: "Courier New",
            align: "left", margin: 0
        });
    });
}

function sectionHeader(slide, num, title2) {
    slide.background = { color: C.bg };
    slide.addShape(pres.shapes.RECTANGLE, {
        x: 0, y: 0, w: 10, h: 5.625, fill: { color: C.bg }, line: { color: C.bg }
    });
    slide.addText(`0${num}`, {
        x: 0.5, y: 1.2, w: 9, h: 1.4,
        fontSize: 110, bold: true, color: "1A2535", fontFace: "Calibri", align: "left", margin: 0
    });
    slide.addText(title2, {
        x: 0.6, y: 2.5, w: 8.8, h: 0.8,
        fontSize: 36, bold: true, color: C.white, fontFace: "Calibri", align: "left", margin: 0
    });
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 1 — PORTADA
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };

    // grandes bloques de color de fondo decorativos (no stripes — son formas grandes)
    s.addShape(pres.shapes.RECTANGLE, {
        x: 6.8, y: 0, w: 3.2, h: 5.625, fill: { color: C.bgLight }, line: { color: C.bgLight }
    });

    // tres rectángulos de lenguaje en columna derecha
    const langs = [
        { label: "JAVA", color: C.java, y: 0.7 },
        { label: "PYTHON", color: C.python, y: 1.95 },
        { label: "C", color: C.c, y: 3.2 },
    ];
    langs.forEach(l => {
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x: 7.1, y: l.y, w: 2.6, h: 1.1,
            fill: { color: l.color }, rectRadius: 0.1, line: { color: l.color }
        });
        s.addText(l.label, {
            x: 7.1, y: l.y, w: 2.6, h: 1.1,
            fontSize: 28, bold: true, color: "0F1923",
            fontFace: "Calibri", align: "center", valign: "middle", margin: 0
        });
    });

    // título principal
    s.addText("Java, Python y C", {
        x: 0.5, y: 0.8, w: 6.1, h: 1.0,
        fontSize: 40, bold: true, color: C.white,
        fontFace: "Calibri", align: "left", margin: 0
    });
    s.addText("Análisis comparativo de\nparadigmas y aplicaciones prácticas", {
        x: 0.5, y: 1.85, w: 6.1, h: 1.1,
        fontSize: 18, color: C.gray,
        fontFace: "Calibri", align: "left", margin: 0
    });

    s.addText("Sigel Cristian  ·  Laboratorio de Programación  ·  Cátedra: Héctor Cenoz", {
        x: 0.5, y: 4.9, w: 6.1, h: 0.35,
        fontSize: 10, color: C.gray, fontFace: "Calibri", align: "left", margin: 0
    });
    s.addText("Ituzaingó, Corrientes  ·  Junio 2026", {
        x: 0.5, y: 5.2, w: 6.1, h: 0.25,
        fontSize: 10, color: C.gray, fontFace: "Calibri", align: "left", margin: 0
    });

    s.addNotes("Slide de portada. Presentarse brevemente y mencionar que los tres lenguajes serán comparados con código propio del repositorio zotel1 en GitHub.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 2 — ÍNDICE
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Contenido de la presentación");

    const items = [
        { n: "01", t: "Los tres lenguajes", d: "Origen, paradigma, filosofía de diseño" },
        { n: "02", t: "Estructura y tipos", d: "Sintaxis base — Calculadora en C vs Java vs Python" },
        { n: "03", t: "Clases y objetos", d: "Jugador en Java · Jugadores en Black Jack Python" },
        { n: "04", t: "Métodos estáticos", d: "ConsultaMoneda.java · @staticmethod Python · funciones en C" },
        { n: "05", t: "Entrada / Salida", d: "Scanner · scanf/printf · input()/print()" },
        { n: "06", t: "Manejo de errores", d: "try-catch · try-except · validación manual en C" },
        { n: "07", t: "Colecciones", d: "ArrayList · HashMap · list · dict · arrays en C" },
        { n: "08", t: "Conclusión", d: "¿Cuándo usar cada lenguaje?" },
    ];

    items.forEach((item, i) => {
        const col = i < 4 ? 0 : 1;
        const row = i % 4;
        const x = 0.5 + col * 4.8;
        const y = 1.35 + row * 1.02;

        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x, y, w: 4.4, h: 0.88,
            fill: { color: C.bgLight }, rectRadius: 0.07,
            shadow: makeShadow(), line: { color: "2A3F55", width: 1 }
        });
        s.addText(item.n, {
            x: x + 0.12, y: y + 0.08, w: 0.42, h: 0.38,
            fontSize: 16, bold: true, color: C.accent,
            fontFace: "Calibri", align: "center", margin: 0
        });
        s.addText(item.t, {
            x: x + 0.6, y: y + 0.08, w: 3.65, h: 0.32,
            fontSize: 13, bold: true, color: C.white,
            fontFace: "Calibri", align: "left", margin: 0
        });
        s.addText(item.d, {
            x: x + 0.6, y: y + 0.44, w: 3.65, h: 0.32,
            fontSize: 10, color: C.gray,
            fontFace: "Calibri", align: "left", margin: 0
        });
    });

    s.addNotes("Recorrer brevemente el índice. Aclarar que el hilo conductor es comparar el mismo problema resuelto en los tres lenguajes, con código real del repositorio propio.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 3 — SECCIÓN 01
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 1, "Los tres lenguajes");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 4 — PANORAMA GENERAL (3 cards)
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Tres lenguajes, tres filosofías");

    const langs = [
        {
            color: C.java,
            name: "Java",
            sub: "Sun Microsystems, 1996\nGosling — JVM — WORA",
            points: [
                "Orientado a objetos estricto",
                "Tipado estático fuerte",
                "Todo dentro de una clase",
                "Compilado a bytecode",
                "Plataforma: JVM",
            ],
            repo: "→ ChallengeConversor",
        },
        {
            color: C.python,
            name: "Python",
            sub: "Van Rossum, 1991\n\"Readability counts\" — PEP 20",
            points: [
                "Multiparadigma",
                "Tipado dinámico fuerte",
                "Clases opcionales",
                "Interpretado",
                "Sintaxis mínima",
            ],
            repo: "→ Juego_Black_Jack / Piedra-Papel-Tijera",
        },
        {
            color: C.c,
            name: "C",
            sub: "Ritchie, Bell Labs, 1972\nControl total del hardware",
            points: [
                "Procedimental",
                "Tipado estático débil",
                "Sin clases ni objetos",
                "Compilado a código nativo",
                "Gestión manual de memoria",
            ],
            repo: "→ Calculadora (PSeInt → C)",
        },
    ];

    langs.forEach((l, i) => {
        const x = 0.38 + i * 3.16;
        // card
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x, y: 1.2, w: 3.02, h: 4.1,
            fill: { color: C.bgLight }, rectRadius: 0.1,
            shadow: makeShadow(), line: { color: "2A3F55", width: 1 }
        });
        // header color band
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x, y: 1.2, w: 3.02, h: 0.65,
            fill: { color: l.color }, rectRadius: 0.1, line: { color: l.color }
        });
        s.addShape(pres.shapes.RECTANGLE, {
            x, y: 1.55, w: 3.02, h: 0.3,
            fill: { color: l.color }, line: { color: l.color }
        });
        // name
        s.addText(l.name, {
            x, y: 1.2, w: 3.02, h: 0.65,
            fontSize: 22, bold: true, color: "0F1923",
            fontFace: "Calibri", align: "center", valign: "middle", margin: 0
        });
        // subtitle
        s.addText(l.sub, {
            x: x + 0.12, y: 1.92, w: 2.78, h: 0.56,
            fontSize: 9.5, color: C.gray,
            fontFace: "Calibri", align: "left", margin: 0
        });
        // bullets
        l.points.forEach((pt, pi) => {
            s.addText([
                { text: "▸ ", options: { color: l.color, bold: true } },
                { text: pt, options: { color: C.white } }
            ], {
                x: x + 0.12, y: 2.54 + pi * 0.34, w: 2.78, h: 0.3,
                fontSize: 10.5, fontFace: "Calibri", align: "left", margin: 0
            });
        });
        // repo tag
        s.addText(l.repo, {
            x: x + 0.12, y: 4.87, w: 2.78, h: 0.28,
            fontSize: 9, color: l.color, italic: true,
            fontFace: "Calibri", align: "left", margin: 0
        });
    });

    s.addNotes("Comentar brevemente la historia de cada lenguaje. Destacar que los tres proyectos del repo zotel1 fueron seleccionados porque representan exactamente cada paradigma: ChallengeConversor=Java OOP, Black Jack=Python POO, Calculadora=C procedimental.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 5 — SECCIÓN 02
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 2, "Estructura y tipos de datos");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 6 — HOLA MUNDO / CALCULADORA comparado
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "El mismo programa: la Calculadora", "Menú + suma · mismo problema · tres enfoques distintos");

    // Java
    codeCard(s, "JAVA — Principal.java (ChallengeConversor)",
        [
            "public class Principal {",
            "  public static void main(String[] args) {",
            "    Scanner sc = new Scanner(System.in);",
            "    System.out.println(\"1- Dólar → Peso\");",
            "    System.out.println(\"2- Peso → Dólar\");",
            "    int opcion = Integer.parseInt(sc.nextLine());",
            "    double monto = Double.parseDouble(sc.nextLine());",
            "    double result = ConversorMonedas.convertir(opcion, monto);",
            "    System.out.printf(\"Resultado: %.2f%n\", result);",
            "  }",
            "}",
        ],
        C.java, 0.35, 1.2, 4.5, 3.9
    );

    // Python
    codeCard(s, "PYTHON — equivalente",
        [
            "# Sin imports para E/S básica",
            "print(\"1- Suma  2- Resta\")",
            "opcion = int(input(\"Elija: \"))",
            "a = float(input(\"Número 1: \"))",
            "b = float(input(\"Número 2: \"))",
            "ops = {1: lambda x,y: x+y,",
            "       2: lambda x,y: x-y}",
            "print(f\"= {ops[opcion](a,b):.2f}\")",
        ],
        C.python, 5.15, 1.2, 4.5, 3.0
    );

    // C
    codeCard(s, "C — tu Calculadora (PSeInt exportado)",
        [
            "#include <stdio.h>",
            "int main() {",
            "  float a, b, res;  int op;",
            "  printf(\"1-Suma 2-Resta\\n\");",
            "  scanf(\"%i\", &op);",
            "  scanf(\"%f %f\", &a, &b);",
            "  if (op==1) res = a+b;",
            "  else       res = a-b;",
            "  printf(\"= %f\\n\", res);",
            "}",
        ],
        C.c, 5.15, 4.27, 4.5, 1.12
    );

    // etiquetas comparativas
    const comparisons = [
        { label: "Verbosidad", j: "Alta", p: "Baja", c: "Media", y: 1.22 },
        { label: "Tipos", j: "Estático", p: "Dinámico", c: "Estático", y: 1.56 },
        { label: "E/S", j: "Scanner", p: "input()", c: "scanf()", y: 1.90 },
        { label: "Resultado", j: "printf()", p: "f-string", c: "printf()", y: 2.24 },
    ];

    s.addText("Comparación rápida", {
        x: 0.35, y: 4.88, w: 4.5, h: 0.25,
        fontSize: 10, bold: true, color: C.accent, fontFace: "Calibri", align: "left", margin: 0
    });

    s.addText("Característica", {
        x: 0.35, y: 5.15, w: 1.2, h: 0.2,
        fontSize: 9, bold: true, color: C.gray, fontFace: "Calibri", align: "left", margin: 0
    });
    s.addText("Java", {
        x: 1.58, y: 5.15, w: 1.0, h: 0.2,
        fontSize: 9, bold: true, color: C.java, fontFace: "Calibri", align: "left", margin: 0
    });
    s.addText("Python", {
        x: 2.62, y: 5.15, w: 1.0, h: 0.2,
        fontSize: 9, bold: true, color: C.python, fontFace: "Calibri", align: "left", margin: 0
    });
    s.addText("C", {
        x: 3.62, y: 5.15, w: 0.8, h: 0.2,
        fontSize: 9, bold: true, color: C.c, fontFace: "Calibri", align: "left", margin: 0
    });
    comparisons.forEach((c2) => {
        const ry = c2.y + 3.7;
        s.addText(c2.label, { x: 0.35, y: ry, w: 1.2, h: 0.25, fontSize: 9, color: C.gray, fontFace: "Calibri", margin: 0 });
        s.addText(c2.j, { x: 1.58, y: ry, w: 1.0, h: 0.25, fontSize: 9, color: C.white, fontFace: "Calibri", margin: 0 });
        s.addText(c2.p, { x: 2.62, y: ry, w: 1.0, h: 0.25, fontSize: 9, color: C.white, fontFace: "Calibri", margin: 0 });
        s.addText(c2.c, { x: 3.62, y: ry, w: 0.8, h: 0.25, fontSize: 9, color: C.white, fontFace: "Calibri", margin: 0 });
    });

    s.addNotes("Acá podés mostrar tu código real de Principal.java y la calculadora en C. Destacar cómo Python resuelve lo mismo en la mitad de líneas gracias a los lambdas en el diccionario.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 7 — SECCIÓN 03
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 3, "Clases y objetos");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 8 — JUGADOR en 3 lenguajes
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Modelar un Jugador: OOP vs Struct", "Black Jack Python · Conversor Java · C sin clases");

    codeCard(s, "JAVA — Clase Jugador",
        [
            "public class Jugador {",
            "  private String nombre;  // tipado estático",
            "  private int fichas;",
            "",
            "  public Jugador(String n, int f) {",
            "    this.nombre = n;",
            "    this.fichas = f;",
            "  }",
            "  public String getNombre() { return nombre; }",
            "  @Override public String toString() {",
            "    return nombre+\" (\"+fichas+\" fichas)\";",
            "  }",
            "}",
        ],
        C.java, 0.35, 1.2, 4.45, 4.15
    );

    codeCard(s, "PYTHON — jugadores.py (Juego_Black_Jack)",
        [
            "class Jugador:",
            "  def __init__(self, nombre, fichas):",
            "    self.__nombre = nombre  # name mangling",
            "    self.__fichas = fichas",
            "",
            "  def get_nombre(self):",
            "    return self.__nombre",
            "",
            "  def __str__(self):",
            "    return f\"{self.__nombre} ({self.__fichas} fichas)\"",
        ],
        C.python, 5.1, 1.2, 4.55, 3.3
    );

    codeCard(s, "C — struct (sin herencia ni métodos)",
        [
            "typedef struct {",
            "  char nombre[50];  /* sin privado */",
            "  int  fichas;",
            "} Jugador;",
            "",
            "void imprimir(Jugador j) {  /* fn separada */",
            "  printf(\"%s (%d fichas)\\n\",j.nombre,j.fichas);",
            "}",
        ],
        C.c, 5.1, 4.57, 4.55, 1.0
    );

    // diferencias clave
    const diffs = [
        { icon: "🔒", label: "Encapsulamiento", j: "private nativo", p: "__ name mangling", c: "No existe" },
        { icon: "🏗", label: "Constructor", j: "new Jugador()", p: "__init__", c: "inicialización manual" },
        { icon: "📄", label: "toString", j: "@Override", p: "__str__", c: "función printf" },
    ];

    s.addText("Diferencias clave", {
        x: 0.35, y: 5.13, w: 4.45, h: 0.25,
        fontSize: 9.5, bold: true, color: C.accent, fontFace: "Calibri", margin: 0
    });

    diffs.forEach((d, i) => {
        const y2 = 5.38 + i * 0; // se pisarían — los ponemos como texto
        // solo poner en nota, slide ya está llena
    });

    s.addNotes("Mostrar en pantalla el archivo jugadores.py del repositorio Juego_Black_Jack. Destacar el name mangling (self.__nombre) que Python usa para simular privado. Contrastar con private Java y la ausencia total de privado en C.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 9 — HERENCIA
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Herencia y polimorfismo", "Jerarquía real de Juego_Black_Jack · jugadores.py");

    // diagrama herencia Python (tu repo real)
    const nodes = [
        { label: "Jugador", color: C.python, x: 3.8, y: 1.3, w: 2.4, h: 0.55 },
        { label: "JugadorBlackJack", color: C.python, x: 3.8, y: 2.3, w: 2.4, h: 0.55 },
        { label: "Humano", color: "5A7BA8", x: 2.0, y: 3.4, w: 2.0, h: 0.55 },
        { label: "Compu", color: "5A7BA8", x: 5.8, y: 3.4, w: 2.0, h: 0.55 },
    ];
    nodes.forEach(n => {
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x: n.x, y: n.y, w: n.w, h: n.h,
            fill: { color: n.color }, rectRadius: 0.08, line: { color: n.color }
        });
        s.addText(n.label, {
            x: n.x, y: n.y, w: n.w, h: n.h,
            fontSize: 12, bold: true, color: "0F1923",
            fontFace: "Calibri", align: "center", valign: "middle", margin: 0
        });
    });
    // flechas (líneas)
    s.addShape(pres.shapes.LINE, { x: 5.0, y: 1.85, w: 0, h: 0.45, line: { color: C.gray, width: 1.5 } });
    s.addShape(pres.shapes.LINE, { x: 5.0, y: 2.85, w: 0, h: 0.25, line: { color: C.gray, width: 1.5 } });
    s.addShape(pres.shapes.LINE, { x: 3.0, y: 3.1, w: 2.0, h: 0, line: { color: C.gray, width: 1.5 } });
    s.addShape(pres.shapes.LINE, { x: 5.0, y: 3.1, w: 1.8, h: 0, line: { color: C.gray, width: 1.5 } });
    s.addShape(pres.shapes.LINE, { x: 3.0, y: 3.1, w: 0, h: 0.3, line: { color: C.gray, width: 1.5 } });
    s.addShape(pres.shapes.LINE, { x: 6.8, y: 3.1, w: 0, h: 0.3, line: { color: C.gray, width: 1.5 } });

    // métodos de cada subclase
    codeCard(s, "Humano.pedir_carta() — jugadores.py",
        [
            "class Humano(JugadorBlackJack):",
            "  def pedir_carta(self):",
            "    resp = input('¿Pedir carta? [s/n]: ')",
            "    return resp.strip().lower() == 's'",
        ],
        C.python, 0.35, 1.2, 4.05, 1.65
    );

    codeCard(s, "Compu.pedir_carta() — jugadores.py",
        [
            "class Compu(JugadorBlackJack):",
            "  def pedir_carta(self):",
            "    # estrategia automática: pide si suma < 17",
            "    return self.__suma_mano() < 17",
        ],
        C.python, 0.35, 3.0, 4.05, 1.65
    );

    // Java comparado
    codeCard(s, "JAVA — mismo concepto con extends",
        [
            "public class Humano extends JugadorBJ {",
            "  @Override",
            "  public boolean pedirCarta() {",
            "    return scanner.next().equals(\"s\");",
            "  }",
            "}",
            "public class Compu extends JugadorBJ {",
            "  @Override",
            "  public boolean pedirCarta() {",
            "    return getSumaMano() < 17;",
            "  }",
            "}",
        ],
        C.java, 0.35, 4.72, 4.05, 0.68
    );

    s.addText("C: no tiene herencia nativa.\nSe simula con struct anidado + punteros a función.", {
        x: 5.5, y: 4.75, w: 4.1, h: 0.62,
        fontSize: 11, color: C.gray, fontFace: "Calibri", italic: true, margin: 0
    });

    s.addNotes("Abrir el archivo jugadores.py en GitHub y mostrar la jerarquía real. El polimorfismo de pedir_carta() es el punto central: mismo mensaje, comportamiento diferente según si es Humano o Compu.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 10 — SECCIÓN 04
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 4, "Métodos estáticos");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 11 — MÉTODOS ESTÁTICOS
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Métodos estáticos", "ConsultaMoneda.java · generador_cartas.py · funciones en C");

    codeCard(s, "JAVA — ConsultaMoneda.java (ChallengeConversor)",
        [
            "public class ConsultaMoneda {",
            "",
            "  // static = pertenece a la CLASE, no a una instancia",
            "  public static Monedas buscarMoneda(String cod) {",
            "    HttpClient client = HttpClient.newHttpClient();",
            "    HttpRequest req = HttpRequest.newBuilder()",
            "        .uri(URI.create(URL_API + cod))",
            "        .build();",
            "    HttpResponse<String> resp =",
            "        client.send(req, BodyHandlers.ofString());",
            "    return new Gson().fromJson(resp.body(), Monedas.class);",
            "  }",
            "}",
            "// Uso: ConsultaMoneda.buscarMoneda(\"USD\");",
        ],
        C.java, 0.35, 1.2, 5.6, 4.15
    );

    codeCard(s, "PYTHON — generador_cartas.py (Juego_Black_Jack)",
        [
            "class GeneradorCartas:",
            "  @staticmethod",
            "  def generar_mazo():",
            "    palos  = ['♠','♥','♦','♣']",
            "    vals   = ['A','2','3','4','5',",
            "              '6','7','8','9','10',",
            "              'J','Q','K']",
            "    return [f\"{v}{p}\" for p in palos",
            "            for v in vals]",
            "",
            "# Invocación sin instancia:",
            "mazo = GeneradorCartas.generar_mazo()",
        ],
        C.python, 6.1, 1.2, 3.55, 3.7
    );

    codeCard(s, "C — todas las funciones son 'estáticas'",
        [
            "/* En C no hay instancias: todo es función global */",
            "float dividir(float a, float b) {",
            "  if (b == 0) {",
            "    printf(\"Error: div por cero\\n\");",
            "    return 0;",
            "  }",
            "  return a / b;",
            "}",
            "float r = dividir(10.0, 3.0);",
        ],
        C.c, 6.1, 5.0, 3.55, 0.45
    );

    // concepto
    s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
        x: 0.35, y: 5.42, w: 5.6, h: 0.0, fill: { color: C.bgLight }, rectRadius: 0.07, line: { color: "2A3F55" }
    });
    s.addText([
        { text: "💡 ", options: { fontSize: 11 } },
        { text: "static", options: { fontSize: 11, bold: true, color: C.java } },
        { text: " → sin new, invocación directa sobre la clase. Útil para utilidades y parsers.", options: { fontSize: 11, color: C.white } },
    ], {
        x: 0.35, y: 5.42, w: 5.6, h: 0.0,
        fontFace: "Calibri", align: "left", margin: 0
    });

    s.addNotes("Mostrar el archivo ConsultaMoneda.java real del repo. Destacar que buscarMoneda() es static porque no necesita estado de instancia — solo recibe un código y devuelve datos. Comparar con @staticmethod de Python que hace exactamente lo mismo pero sin la verbosidad del tipo de retorno.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 12 — SECCIÓN 05 E/S
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 5, "Entrada y Salida de datos");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 13 — E/S COMPARADA
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Entrada → Procesamiento → Salida", "El mismo flujo, tres APIs distintas");

    // flecha flujo arriba
    ["Entrada", "Procesamiento", "Salida"].forEach((step, i) => {
        const x = 0.5 + i * 3.2;
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x, y: 1.18, w: 2.7, h: 0.42,
            fill: { color: i === 0 ? "2A4A6B" : i === 1 ? "2A5040" : "5A3A2A" },
            rectRadius: 0.06, line: { color: "2A3F55" }
        });
        s.addText(step, {
            x, y: 1.18, w: 2.7, h: 0.42,
            fontSize: 12, bold: true,
            color: i === 0 ? C.python : i === 1 ? C.c : C.java,
            fontFace: "Calibri", align: "center", valign: "middle", margin: 0
        });
        if (i < 2) s.addShape(pres.shapes.LINE, {
            x: x + 2.7, y: 1.39, w: 0.5, h: 0,
            line: { color: C.gray, width: 1.5 }
        });
    });

    codeCard(s, "C — scanf / printf (tu Calculadora)",
        [
            "// ENTRADA",
            "scanf(\"%i\", &desicion);",
            "scanf(\"%f\", &primernumero);",
            "scanf(\"%f\", &segundonumero);",
            "",
            "// PROCESAMIENTO",
            "sum = primernumero + segundonumero;",
            "",
            "// SALIDA",
            "printf(\"La suma es: %f\\n\", sum);",
            "",
            "// CONTINUAR o SALIR",
            "printf(\"¿Otra operación? [s/n]\\n\");",
            "scanf(\"%s\", opcion);",
        ],
        C.c, 0.35, 1.75, 3.0, 3.7
    );

    codeCard(s, "JAVA — Scanner + printf (ChallengeConversor)",
        [
            "// ENTRADA",
            "Scanner sc = new Scanner(System.in);",
            "System.out.print(\"Opción: \");",
            "int op = Integer.parseInt(sc.nextLine());",
            "System.out.print(\"Monto: \");",
            "double monto = Double.parseDouble(",
            "    sc.nextLine());",
            "",
            "// PROCESAMIENTO",
            "double result = ConversorMonedas",
            "    .convertir(op, monto);",
            "",
            "// SALIDA",
            "System.out.printf(\"= %.2f%n\", result);",
        ],
        C.java, 3.5, 1.75, 3.0, 3.7
    );

    codeCard(s, "PYTHON — input / print / f-string",
        [
            "# ENTRADA",
            "op  = int(input(\"Opción: \"))",
            "a   = float(input(\"Número 1: \"))",
            "b   = float(input(\"Número 2: \"))",
            "",
            "# PROCESAMIENTO",
            "ops = {1:lambda x,y:x+y,",
            "       2:lambda x,y:x-y,",
            "       3:lambda x,y:x*y,",
            "       4:lambda x,y:x/y}",
            "",
            "# SALIDA",
            "print(f\"Resultado = {ops[op](a,b):.2f}\")",
        ],
        C.python, 6.65, 1.75, 3.0, 3.7
    );

    // tabla de comparación
    const rows = [
        ["", "C", "Java", "Python"],
        ["Leer texto", "scanf(\"%s\")", "sc.nextLine()", "input()"],
        ["Leer entero", "scanf(\"%i\")", "Integer.parseInt()", "int(input())"],
        ["Leer float", "scanf(\"%f\")", "Double.parseDouble()", "float(input())"],
        ["Imprimir", "printf(\"%f\")", "System.out.printf()", "print(f\"\")"],
    ];
    s.addTable(rows.map((r, ri) => r.map((c2, ci) => ({
        text: c2,
        options: {
            fill: { color: ri === 0 ? "1A2535" : ci === 0 ? "1A2535" : C.bgCard },
            color: ri === 0 ? C.accent : ci === 0 ? C.gray : C.white,
            bold: ri === 0 || ci === 0,
            fontSize: 8.5,
            fontFace: "Calibri",
            align: "left",
        }
    }))), {
        x: 0.35, y: 5.5, w: 9.3, h: 0.0,
        colW: [1.2, 2.7, 2.7, 2.7],
        border: { pt: 0.5, color: "2A3F55" }
    });

    s.addNotes("Señalar cómo C obliga a especificar el tipo en el formato (%f, %i, %s). Java parsea explícitamente Integer.parseInt / Double.parseDouble. Python convierte en la misma línea con int() o float(). Las tres son seguras pero con niveles distintos de verbosidad.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 14 — SECCIÓN 06 ERRORES
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 6, "Manejo de errores");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 15 — MANEJO DE ERRORES
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "División por cero: tres formas de manejarlo", "El mismo error — C manual · Java checked · Python unchecked");

    codeCard(s, "C — tu Calculadora (validación manual)",
        [
            "// C no tiene excepciones",
            "// el programador DEBE validar a mano",
            "if (desicion == 4) {",
            "  scanf(\"%f\", &primernumero);",
            "  scanf(\"%f\", &segundonumero);",
            "",
            "  if (primernumero==0 && segundonumero==0) {",
            "    printf(\"Op. inválida: 0/0\\n\");",
            "  } else if (segundonumero == 0) {",
            "    printf(\"No existe x: x*0=%f\\n\",",
            "           primernumero);",
            "  } else {",
            "    div = primernumero / segundonumero;",
            "    printf(\"= %f\\n\", div);",
            "  }",
            "}",
        ],
        C.c, 0.35, 1.2, 4.35, 4.15
    );

    codeCard(s, "JAVA — try-catch tipado (ChallengeConversor)",
        [
            "public static double convertir(",
            "       int op, double monto) {",
            "  try {",
            "    Monedas m = ConsultaMoneda",
            "        .buscarMoneda(obtenerCodigo(op));",
            "    double tasa = m.getConversion();",
            "    if (tasa == 0)",
            "      throw new ArithmeticException(",
            "          \"Tasa de cambio inválida\");",
            "    return monto * tasa;",
            "  } catch (IOException | Interrupted",
            "           Exception e) {",
            "    throw new RuntimeException(e);",
            "  }",
            "}",
        ],
        C.java, 4.85, 1.2, 4.8, 4.15
    );

    // Python
    codeCard(s, "PYTHON — try-except sin tipos forzados",
        [
            "def dividir(a, b):",
            "  try:",
            "    return a / b",
            "  except ZeroDivisionError as e:",
            "    print(f\"Error: {e}\")",
            "    return None",
        ],
        C.python, 0.35, 5.42, 4.35, 0.0
    );

    // conceptos clave
    const keys = [
        { t: "C", d: "Sin excepciones. if/else manuales. Si olvidás validar → comportamiento indefinido.", color: C.c },
        { t: "Java", d: "Checked exceptions forzadas por el compilador. RuntimeException para errores de programación.", color: C.java },
        { t: "Python", d: "Solo unchecked. El compilador no obliga. Se detectan en ejecución.", color: C.python },
    ];
    keys.forEach((k, i) => {
        s.addText([
            { text: `${k.t}: `, options: { bold: true, color: k.color } },
            { text: k.d, options: { color: C.gray } }
        ], {
            x: 4.85, y: 5.38 + i * 0.0, w: 4.8, h: 0.0,
            fontSize: 9.5, fontFace: "Calibri", align: "left", margin: 0
        });
    });

    s.addNotes("Abrir el código real de la calculadora y señalar el bloque if/else de la división por cero. Es código tuyo — explicar por qué pusiste esa doble validación (0/0 y divisor==0). Luego mostrar que Java lo hace con excepciones tipadas.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 16 — SECCIÓN 07 COLECCIONES
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 7, "Colecciones de datos");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 17 — COLECCIONES
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "Colecciones: nativas vs librería vs manual", "ArrayList · HashMap · list · dict · arrays en C");

    codeCard(s, "JAVA — ArrayList + HashMap (ChallengeConversor style)",
        [
            "// Lista tipada de monedas",
            "ArrayList<String> monedas = new ArrayList<>();",
            "monedas.add(\"USD\");",
            "monedas.add(\"ARS\");",
            "monedas.add(\"BRL\");",
            "System.out.println(monedas.get(0)); // USD",
            "",
            "// Mapa código → tasa de cambio",
            "HashMap<String, Double> tasas = new HashMap<>();",
            "tasas.put(\"ARS\", 950.0);",
            "tasas.put(\"BRL\", 5.0);",
            "double t = tasas.getOrDefault(\"EUR\", 1.0);",
        ],
        C.java, 0.35, 1.2, 4.45, 3.65
    );

    codeCard(s, "PYTHON — list + dict (Juego_Black_Jack)",
        [
            "# Lista de cartas (mazos.py)",
            "mazo = GeneradorCartas.generar_mazo()",
            "mazo.append(\"AS\")  # dinámico",
            "print(mazo[0])     # primer elemento",
            "",
            "# Dict jugador → fichas",
            "fichas = {\"Ana\": 500, \"Bot\": 1000}",
            "fichas[\"Ana\"] -= 100",
            "",
            "# List comprehension (solo Python)",
            "activos = [j for j in jugadores",
            "           if j.get_fichas() > 0]",
        ],
        C.python, 5.1, 1.2, 4.55, 3.65
    );

    codeCard(s, "C — array estático (tu Calculadora)",
        [
            "/* C: array de tamaño fijo */",
            "char* ops[4] = {",
            "  \"Suma\",\"Resta\",",
            "  \"Multiplicación\",\"División\"",
            "};",
            "for (int i=0; i<4; i++)",
            "  printf(\"%d- %s\\n\", i+1, ops[i]);",
            "/* Lista dinámica requiere malloc() */",
        ],
        C.c, 0.35, 4.98, 9.3, 0.5
    );

    // tabla comparativa
    s.addTable([
        [{ text: "Estructura", options: { bold: true, color: C.accent, fill: { color: "1A2535" }, fontSize: 9 } },
        { text: "Java", options: { bold: true, color: C.java, fill: { color: "1A2535" }, fontSize: 9 } },
        { text: "Python", options: { bold: true, color: C.python, fill: { color: "1A2535" }, fontSize: 9 } },
        { text: "C", options: { bold: true, color: C.c, fill: { color: "1A2535" }, fontSize: 9 } }],
        ["Lista dinámica", "ArrayList<T>", "list []", "malloc() manual"],
        ["Mapa clave-valor", "HashMap<K,V>", "dict {}", "No nativo"],
        ["Sin duplicados", "HashSet<T>", "set {}", "No nativo"],
        ["Inmutable", "List.of()", "tuple ()", "const array"],
    ], {
        x: 0.35, y: 4.93, w: 9.3, h: 0.0,
        colW: [2.0, 2.43, 2.43, 2.44],
        border: { pt: 0.5, color: "2A3F55" },
        fontSize: 9.5, fontFace: "Calibri", color: C.white
    });

    s.addNotes("Destacar que Python tiene list y dict como tipos del lenguaje con sintaxis literal — no necesita importar nada. Java requiere instanciar explícitamente con new. C no tiene nada: si necesitás una lista dinámica, tenés que implementarla con malloc.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 18 — SECCIÓN 08 CONCLUSIÓN
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    sectionHeader(s, 8, "Conclusión");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 19 — ¿CUÁNDO USAR CADA UNO?
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };
    title(s, "¿Cuándo usar cada lenguaje?", "No son competidores — son herramientas para problemas distintos");

    const cards = [
        {
            color: C.c,
            lang: "C",
            when: "Sistemas operativos · Drivers · Firmware · Tiempo real",
            why: "Control total de memoria. Código nativo. Sin overhead de VM.",
            avoid: "Proyectos grandes con muchos desarrolladores.",
            repo: "Tu calculadora: demostró el paradigma procedimental puro."
        },
        {
            color: C.python,
            lang: "Python",
            when: "Scripting · Data Science · IA · Prototipado rápido",
            why: "Máxima expresividad. Ecosistema enorme (numpy, pandas, torch).",
            avoid: "Aplicaciones de tiempo real o recursos limitados.",
            repo: "Black Jack / Piedra-Papel-Tijera: POO concisa, herencia clara."
        },
        {
            color: C.java,
            lang: "Java",
            when: "Backends empresariales · Android · Microservicios",
            why: "Tipado estático + OOP = mantenibilidad a escala. JVM portable.",
            avoid: "Prototipado rápido o scripts de uso único.",
            repo: "ChallengeConversor: clases, API REST, tipado estático, static."
        },
    ];

    cards.forEach((card, i) => {
        const x = 0.38 + i * 3.2;
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x, y: 1.18, w: 2.95, h: 4.18,
            fill: { color: C.bgLight }, rectRadius: 0.1,
            shadow: makeShadow(), line: { color: "2A3F55", width: 1 }
        });
        // header
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x, y: 1.18, w: 2.95, h: 0.6,
            fill: { color: card.color }, rectRadius: 0.1, line: { color: card.color }
        });
        s.addShape(pres.shapes.RECTANGLE, {
            x, y: 1.52, w: 2.95, h: 0.26,
            fill: { color: card.color }, line: { color: card.color }
        });
        s.addText(card.lang, {
            x, y: 1.18, w: 2.95, h: 0.6,
            fontSize: 20, bold: true, color: "0F1923",
            fontFace: "Calibri", align: "center", valign: "middle", margin: 0
        });

        const rows2 = [
            { label: "✅ Usar para", txt: card.when },
            { label: "💪 Fortaleza", txt: card.why },
            { label: "⚠️ Evitar", txt: card.avoid },
            { label: "📂 Tu repo", txt: card.repo },
        ];
        rows2.forEach((r, ri) => {
            s.addText(r.label, {
                x: x + 0.12, y: 1.88 + ri * 0.82, w: 2.72, h: 0.24,
                fontSize: 9, bold: true, color: card.color,
                fontFace: "Calibri", align: "left", margin: 0
            });
            s.addText(r.txt, {
                x: x + 0.12, y: 2.12 + ri * 0.82, w: 2.72, h: 0.48,
                fontSize: 9, color: C.white,
                fontFace: "Calibri", align: "left", margin: 0
            });
        });
    });

    s.addNotes("Cerrar la presentación con esta conclusión. Remarcar que los tres proyectos propios (ChallengeConversor, Black Jack, Calculadora) muestran exactamente los tres paradigmas: Java=OOP empresarial, Python=OOP expresivo, C=procedimental de bajo nivel. El conocimiento de los tres amplía el rango de herramientas del desarrollador.");
}

// ═══════════════════════════════════════════════════════════════════════════
// SLIDE 20 — CIERRE + LINKS REPO
// ═══════════════════════════════════════════════════════════════════════════
{
    const s = pres.addSlide();
    s.background = { color: C.bg };

    s.addShape(pres.shapes.RECTANGLE, {
        x: 6.5, y: 0, w: 3.5, h: 5.625, fill: { color: C.bgLight }, line: { color: C.bgLight }
    });

    s.addText("Gracias", {
        x: 0.5, y: 0.9, w: 5.8, h: 1.1,
        fontSize: 52, bold: true, color: C.white,
        fontFace: "Calibri", align: "left", margin: 0
    });
    s.addText("Sigel Cristian\nLaboratorio de Programación\nCátedra: Héctor Cenoz\nJunio 2026", {
        x: 0.5, y: 2.1, w: 5.8, h: 1.0,
        fontSize: 13, color: C.gray, fontFace: "Calibri", align: "left", margin: 0
    });

    // repos
    const repos = [
        { name: "ChallengeConversor", lang: "Java", color: C.java, url: "github.com/zotel1/ChallengeConversor" },
        { name: "Juego_Black_Jack", lang: "Python", color: C.python, url: "github.com/zotel1/Juego_Black_Jack" },
        { name: "Piedra-Papel-Tijera", lang: "Python", color: C.python, url: "github.com/zotel1/Piedra-Papel-Tijera" },
    ];

    s.addText("Repositorios utilizados", {
        x: 0.5, y: 3.3, w: 5.8, h: 0.3,
        fontSize: 11, bold: true, color: C.accent, fontFace: "Calibri", margin: 0
    });
    repos.forEach((r, i) => {
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x: 0.5, y: 3.65 + i * 0.55, w: 5.8, h: 0.45,
            fill: { color: C.bgCard }, rectRadius: 0.06, line: { color: "2A3F55" }
        });
        s.addText(r.name, {
            x: 0.62, y: 3.65 + i * 0.55, w: 2.8, h: 0.45,
            fontSize: 11, bold: true, color: C.white, fontFace: "Calibri", valign: "middle", margin: 0
        });
        badge(s, r.lang, r.color, 3.5, 3.72 + i * 0.55);
        s.addText(r.url, {
            x: 4.7, y: 3.65 + i * 0.55, w: 1.5, h: 0.45,
            fontSize: 8, color: C.gray, fontFace: "Calibri", valign: "middle", italic: true, margin: 0
        });
    });

    // columna derecha — resumen
    const summary = [
        { color: C.c, label: "C", val: "Procedimental · Bajo nivel · Rendimiento" },
        { color: C.python, label: "Python", val: "Multiparadigma · Expresivo · Ecosistema" },
        { color: C.java, label: "Java", val: "OOP estricto · Tipado · Escalabilidad" },
    ];

    s.addText("En resumen", {
        x: 6.7, y: 0.5, w: 3.1, h: 0.35,
        fontSize: 14, bold: true, color: C.accent, fontFace: "Calibri", margin: 0
    });
    summary.forEach((sum, i) => {
        s.addShape(pres.shapes.ROUNDED_RECTANGLE, {
            x: 6.7, y: 1.0 + i * 1.45, w: 3.1, h: 1.3,
            fill: { color: sum.color }, rectRadius: 0.1, line: { color: sum.color }
        });
        s.addText(sum.label, {
            x: 6.7, y: 1.0 + i * 1.45, w: 3.1, h: 0.5,
            fontSize: 20, bold: true, color: "0F1923",
            fontFace: "Calibri", align: "center", valign: "middle", margin: 0
        });
        s.addText(sum.val, {
            x: 6.7, y: 1.5 + i * 1.45, w: 3.1, h: 0.8,
            fontSize: 10, color: "0F1923",
            fontFace: "Calibri", align: "center", margin: 0
        });
    });

    s.addNotes("Slide de cierre. Podés mencionar que el portfolio en github.com/zotel1 tiene 94 repositorios con proyectos en Java, Python y JavaScript. Invitar preguntas.");
}

// ── EXPORTAR ──────────────────────────────────────────────────────────────
pres.writeFile({ fileName: "/home/claude/presentacion_comparativa.pptx" })
    .then(() => {
        console.log("OK");
    });