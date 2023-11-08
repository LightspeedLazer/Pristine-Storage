## Passive Provider
[[Provider Settings#Passive Provider|Passive Providers]] give a network access to their contents, but they wont try to push their contents into [[Requester Settings#Passive Requester|Passive Requesters]].
>[!example]+ Use cases
>- Output side of a machine that has a sufficient output storage
>- Storage inventories

>[!check]- Compatibility
[[Provider Settings#Passive Provider|Passive Providers]] are compatible with all [[Requester Settings]].
## Active Provider
[[Provider Settings#Active Provider|Active Providers]] give a network access to their contents, and will try to push their contents into [[Requester Settings#Passive Requester|Passive Requesters]].
>[!example]+ Use cases
>- Output side of a machine that doesn't have a sufficient output storage
>- Output side of a machine that has byproducts that will block production of the main product

>[!caution] Storage Flooding
>If you have a machine that is constantly producing a product, placing an [[Provider Settings#Active Provider|Active Provider]] to collect its output can flood your storage, leaving no room for anything else.
>It is advised to limit the machine in some way, either by limiting the input or limiting the output.

>[!check]- Compatibility
[[Provider Settings#Active Provider|Active Providers]] are not compatible with any [[Requester Settings]].