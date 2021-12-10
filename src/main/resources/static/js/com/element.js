function addElement(form, id, value){
    let el = document.createElement("input");

    el.setAttribute("type", "hidden");
    el.setAttribute("name", id);
    el.setAttribute("id", id);
    el.setAttribute("value", value);

    form.appendChild(el);
}