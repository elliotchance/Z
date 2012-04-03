#include "library.h"

void _init() {
    static_System = (System*) malloc(sizeof(System));
    static_System->out = (PrintStream*) malloc(sizeof(PrintStream));
    static_System->out->println = &println;
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

void println(String *string) {
    printf("%s\n", string->data);
}
