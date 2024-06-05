<template>

<header>
  <nav class="navbar navbar-expand-lg bg-primary">
      <div class="container-fluid miri">
        <!-- <a class="navbar-brand" href="#">MIRI</a> -->
        <router-link class="navbar-brand logo" to="/">MIRI</router-link>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarScroll"
          aria-controls="navbarScroll"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarScroll">
          <ul
            class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
            style="--bs-scroll-height: 100px"
          >

            <li class="nav-item">
              <router-link to="/login" class="nav-link">Login</router-link>
            </li>
            <li class="nav-item">
              <router-link to="/list" class="nav-link">List</router-link>
            </li>
            <li class="nav-item dropdown">
              <a
                class="nav-link dropdown-toggle"
                href="#"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                Genre
              </a>
              <ul class="dropdown-menu">
                <li><a class="dropdown-item text-primary" href="#">Action</a></li>
                <li><a class="dropdown-item text-primary" href="#">Action</a></li>
                <li><a class="dropdown-item text-primary" href="#">Action</a></li>
                <li><a class="dropdown-item text-primary" href="#">Action</a></li>
                <li><a class="dropdown-item text-primary" href="#">Action</a></li>
                <li><hr class="dropdown-divider" /></li>
                <li>
                  <a class="dropdown-item text-primary" href="#">Something else</a>
                </li>
              </ul>
            </li>
            <li class="nav-item">
              <a class="nav-link disabled" aria-disabled="true">Link</a>
            </li>
          </ul>
          <form class="d-flex" role="search">
            <input
              class="form-control me-2"
              type="search"
              placeholder="Search"
              aria-label="Search"
            />
            <button class="btn btn-outline-light" type="submit">
              Search
            </button>
          </form>
        </div>
      </div>
    </nav>
</header>

</template>


<script>
export default {
    
}
</script>


<style>
.miri{
  width: 65%;
}
.miri a{
    color: white;
}
.logo{
    font-size:x-large;
    font-weight: 900;
}
</style>