#include "library.h"

void _init() {
    static_System = (System*) malloc(sizeof(System));
    static_System->out = (PrintStream*) malloc(sizeof(PrintStream));
    static_System->out->println_L = &println_L;
    static_System->out->println_F = &println_F;
}

String* _String_new(char* raw) {
    String *r = (String*) malloc(sizeof(String));
    r->len = strlen(raw);
    r->data = (char*) malloc(r->len + 1);
    memmove(r->data, raw, r->len);
    return r;
}

Object* _Object_new(char* className, void* obj) {
    Object *o = (Object*) malloc(sizeof(Object));
    o->className = (char*) malloc(strlen(className));
    o->obj = obj;
    return o;
}

void println_L(String *string) {
    printf("%s\n", string->data);
}
void println_F(float f) {
    printf("%g\n", f);
}
