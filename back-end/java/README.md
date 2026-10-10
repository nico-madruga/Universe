<h1>Back-End of Universe</h1>
<b>Used languages:</b>
<ul>
    <li>Java</li>
    <li>C (to be implemented)</li>
</ul>
<b>Technologies:</b>
<ul>
    <li>Spring Boot</li>
    <li>Spring Security</li>
    <li>JPA</li>
</ul>

<h2>Highlights</h2>
<ul>
    <li>Involves planets and universe (cool stuff) (to be implemented)</li>
    <li>3D Rendering (to be implemented)</li>
</ul>

<h2>Overview</h2>
<p>This is a personal project for learning purposes, thats why so many stuff is still to be implemented.</p>

<p>The project is mainly about manipulating stuff around the universe like:</p>
<ul>
    <li>Stars
    <li>Planets
    <li>Star Systems
    <li>Galaxies
</ul>

<p>And allow you to put your own 3D model of a planet for you to create!</p>

<h2>Usage</h2>
<p>i really can't show its usage in action rn, but some time i will!

<h2>Concepts</h2>

<p>This is were i'll keep track of what i learned, so its the main thing for now.</p>

<h3>Spring</h3>

<p>Spring is a framework developed to simplify the development of coding, making things like object setups for databases, security and object management more simple, leaving it all for spring to manage with the annotations.</p>

<h3>Inversion of Control</h3>

<p>This is the main thing, with spring, we have a new management container, one of which handles all the stuff i wrote about in the previous section. This concept means that we are inverting the management of objects lifecycles or the call of custom code when specific events happen.</p>

<h3>Beans</h3>

<p> <b>@Bean, @Service, @Configuration</b> are some examples of annotations that tell spring which classes are beans. For every class that you need spring to manage, we use this type of annotation to tell it is responsible for the class management. A bean is an object whose lifecycle and dependencies are managed by the Spring container</p>

<h3>Dependency Injection</h3>

<p>When a class depends on another class to make some type of action, like when the controller needs the service to take care of business rules, we call it a dependency. Spring can also manage that, using the annotations <b>@RestController/@Controller, @Service, @Component, @Configurator, @Repository, @Qualifier and @Autowired</b></p>

<h3>Security Filter Chain</h3>

<p>Its the layer where a series of request filters occur, its where authorization and authentication configurations are made, such as normal user can't use some HTTP method or every user can use a GET method.</p>

<h3>HttpSecurity Class</h3>

<p>Its the class that provides web based security configuration for requests, by standard, it is applied for every request, but its possible to configure just as said in the previous section</p>

<p><b>NOTE:</b> The security filter chain is the chain of filters that processes HTTP requests. In Spring Security, we configure it using HttpSecurity and expose the resulting SecurityFilterChain as a Spring bean.</p>







