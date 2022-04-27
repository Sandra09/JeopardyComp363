window.addEventListener("load", () > {
    <!--    const params = (new URL(document.location)).searchParams;-->
    <!--    const name = params.get("name");-->

        const name = sessionStorage.getItem('NAME');
        const name0 = sessionStorage.getItem('NAME0');
        const name1 = sessionStorage.getItem('NAME1');

        document.getElementById("result-name").innerHTML = name;
        document.getElementById("result-name0").innerHTML = name0;
        document.getElementById("result-name1").innerHTML = name1;
    }